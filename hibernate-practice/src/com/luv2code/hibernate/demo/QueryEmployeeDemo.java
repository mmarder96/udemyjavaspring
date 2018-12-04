package com.luv2code.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.hibernate.demo.entity.Employee;

import java.util.List;

public class QueryEmployeeDemo {

    public static void main(String[] args) {

        // create session factory
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();

        // create session
        Session session = factory.getCurrentSession();

        try {

            // start a transaction
            session.beginTransaction();

            // query employees
            List<Employee> theEmployees = session.createQuery("FROM Employee").getResultList();

            // display the employees
            System.out.println("\nList of employees");
            displayEmployees(theEmployees);

            // query employees with last name Kujo or company WFS
            theEmployees = session.createQuery("FROM Employee e " +
                    "WHERE e.lastName = 'Kujo' OR e.company = 'WFS'").getResultList();

            // display the employees
            System.out.println("\nList of employees with last name Kujo or company WFS");
            displayEmployees(theEmployees);

            // commit the transaction
            session.getTransaction().commit();
            System.out.println("Done!");

        } finally {
            factory.close();
        }
    }

    private static void displayEmployees(List<Employee> theEmployees) {
        for (Employee employee : theEmployees) {
            System.out.println(employee);
        }
        System.out.println();
    }
}
