package com.luv2code.hibernate.demo;

import com.luv2code.hibernate.demo.entity.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ReadStudentDemo {

    public static void main(String[] args) {

        // create session factory
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Student.class)
                .buildSessionFactory();

        // create session
        Session session = factory.getCurrentSession();

        try {
            // create student object
            Student tempStudent = new Student("Jotaro", "Kujo", "jkujo@luv2code.com");
            System.out.println("Creating new Student: " + tempStudent.toString());

            // start a transaction
            session.beginTransaction();

            // save the student
            System.out.println("Saving student...");
            session.save(tempStudent);

            // commit the transaction
            session.getTransaction().commit();
            System.out.println("Done!");

            // find student's id: primary key
            System.out.println("Saved student. Generated id: " + tempStudent.getId());

            // get a new session and start transaction
            session = factory.getCurrentSession();
            session.beginTransaction();

            // retrieve student based on the id: primary key
            System.out.println("\nGetting student with id: " + tempStudent.getId());
            Student myStudent = session.get(Student.class, tempStudent.getId());
            System.out.println("Get complete: " + myStudent.toString());

            // commit the transaction
            session.getTransaction().commit();

            System.out.println("Done!");

        } finally {
            factory.close();
        }
    }
}
