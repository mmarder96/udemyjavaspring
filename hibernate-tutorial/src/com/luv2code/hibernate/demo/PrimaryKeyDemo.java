package com.luv2code.hibernate.demo;

import com.luv2code.hibernate.demo.entity.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class PrimaryKeyDemo {

    public static void main(String[] args) {

        // create session factory
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Student.class)
                .buildSessionFactory();

        // create session
        Session session = factory.getCurrentSession();

        try {
            // create three student objects
            Student tempStudent1 = new Student("Jonathan", "Joestar", "jjoestar@luv2code.com");
            Student tempStudent2 = new Student("Dio", "Brando", "dbrando@luv2code.com");
            Student tempStudent3 = new Student("Robert", "Speedwagon", "reospeedwagon@luv2code.com");
            System.out.println("Creating 3 new Students:");
            System.out.println(tempStudent1.toString());
            System.out.println(tempStudent2.toString());
            System.out.println(tempStudent3.toString());

            // start a transaction
            session.beginTransaction();

            // save the student
            System.out.println("Saving students...");
            session.save(tempStudent1);
            session.save(tempStudent2);
            session.save(tempStudent3);

            // commit the transaction
            session.getTransaction().commit();
            System.out.println("Done!");

        } finally {
            factory.close();
        }
    }
}
