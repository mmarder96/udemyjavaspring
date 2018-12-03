package com.luv2code.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class TestJdbc {
    public static void main(String[] args) {

        String jdbcUrl = "jdbc:mysql://localhost:3306/hb_employee_tracker?useSSL=false&serverTimezone=UTC";
        String usr="hbemployee";
        String pass="hbemployee";
        try {
            System.out.println("Connecting to database: " + jdbcUrl);

            Connection myConn = DriverManager.getConnection(jdbcUrl, usr, pass);

            System.out.println("Connection success!");
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
