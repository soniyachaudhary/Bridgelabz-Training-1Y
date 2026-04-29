package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;

public class Student {




    public void insertEntries() {
        String url = "jdbc:mysql://localhost:3306/";
        String user = "Root";
        String password = "Root";

        try {
            // Load Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Connect to MySQL
            Connection con = DriverManager.getConnection(url, user, password);
            Statement stmt = con.createStatement();

            stmt.executeQuery("create database if not exists java");
            //  Use Database
            stmt.executeUpdate("USE testdb");

            //  Create Table
            String createTable = "CREATE TABLE IF NOT EXISTS student (" +
                    "id INT PRIMARY KEY AUTO_INCREMENT, " +
                    "name VARCHAR(50), " +
                    "marks INT)";
            stmt.executeUpdate(createTable);
            //  Insert Data
            String insertData = "INSERT INTO student(name, marks) VALUES" +
                    "('Tanmay', 85)," +
                    "('Rahul', 90)";
            stmt.executeUpdate(insertData);

            System.out.println("Database, Table created & Data inserted!");

            // Close connection
            con.close();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } finally {
            System.out.println("Database Created Successfully");

        }
    }
      public static void main(String[] args) {
        Student student=new Student();
        student.insertEntries();
    }
    }
