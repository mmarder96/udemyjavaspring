package com.luv2code.hibernate.demo;

import com.luv2code.hibernate.demo.entity.Instructor;
import com.luv2code.hibernate.demo.entity.InstructorDetail;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class DeleteInstructorDetailDemo {

    public static void main(String[] args) {

        // create session factory
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Instructor.class)
                .addAnnotatedClass(InstructorDetail.class)
                .buildSessionFactory();

        // create session
        Session session = factory.getCurrentSession();

        try {

            // start a transaction
            session.beginTransaction();

            // get instructor detail object
            int theId = 2;
            InstructorDetail tempInstructorDetail = session.get(InstructorDetail.class, theId);

            // print the instructor detail
            System.out.println("tempInstructorDetail: " + tempInstructorDetail);

            // print the associated instructor
            System.out.println("associated instructor: " + tempInstructorDetail.getInstructor());

            // delete instructor detail (cascades to associated instructor)
            System.out.println("Deleting tempInstructor Detail: " + tempInstructorDetail);
            session.delete(tempInstructorDetail);

            // commit the transaction
            session.getTransaction().commit();
            System.out.println("Done!");

        } catch (Exception e) {

            e.printStackTrace();

        } finally {

            // close session and resolve leak
            session.close();
            factory.close();

        }
    }
}

