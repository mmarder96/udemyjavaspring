package com.luv2code.hibernate.demo;

import com.luv2code.hibernate.demo.entity.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class QueryStudentDemo {

    public static void main(String[] args) {

        // create session factory
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Student.class)
                .buildSessionFactory();

        // create session
        Session session = factory.getCurrentSession();

        try {

            // start a transaction
            session.beginTransaction();

            // query students
            List<Student> theStudents = session.createQuery("from Student").getResultList();

            // display the students
            displayStudents(theStudents);

            // query students with last name Joestar
            theStudents = session.createQuery("from Student s where s.lastName = 'Kujo'").getResultList();

            // display the students
            System.out.println("\nStudents with last name Joestar");
            displayStudents(theStudents);

            // query students with last name Kujo OR first name Dio
            theStudents = session.createQuery("from Student s where " +
                    "s.lastName = 'Kujo' or s.firstName = 'Dio'").getResultList();

            // display the students
            System.out.println("\nStudents with last name Kujo or first name Dio");
            displayStudents(theStudents);

            // query students with email ending with luv2code.com
            theStudents = session.createQuery("from Student s where " +
                    "s.email LIKE '%luv2code.com'").getResultList();

            // display the students
            System.out.println("\nStudents with email ending with luv2code.com");
            displayStudents(theStudents);

            // commit the transaction
            session.getTransaction().commit();
            System.out.println("\nDone!");

        } finally {
            factory.close();
        }
    }

    private static void displayStudents(List<Student> theStudents) {
        for (Student student : theStudents) {
            System.out.println(student);
        }
    }
}
