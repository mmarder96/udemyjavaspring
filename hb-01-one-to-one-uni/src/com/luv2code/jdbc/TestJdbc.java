package com.luv2code.jdbc;

import java.sql.DriverManager;
import java.sql.Connection;

public class TestJdbc {
    public static void main(String[] args) {

        String jdbcUrl = "jdbc:mysql://localhost:3306/hb-01-one-to-one-uni?useSSL=false&serverTimezone=UTC";
        String usr="hbstudent";
        String pass="hbstudent";
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
