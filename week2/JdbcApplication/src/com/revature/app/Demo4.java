package com.revature.app;

import java.sql.*;
import java.util.Scanner;

public class Demo4 {
    public static void main(String[] args) {
        String driver = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://localhost:5432/nameOfTable"; // might be nameOfDatabase
        String username = "username";
        String password = "password";

        Connection conn = null;
        Statement stmt = null;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter id: ");
        int id = scanner.nextInt();
        System.out.print("Enter name: ");
        String firstname = scanner.nextLine();
        System.out.print("Enter last name: ");
        String lastname = scanner.nextLine();
        System.out.print("Enter email: ");
        String email = scanner.nextLine();

        PreparedStatement pstmt;


        try {
            Class.forName(driver);
            conn = DriverManager.getConnection(url, username, password);
            pstmt = conn.prepareStatement("INSERT INTO student VALUES(?,?,?,?");
            pstmt.setInt(1, id);
            pstmt.setString(2, firstname);
            pstmt.setString(3, lastname);
            pstmt.setString(4, email);
            pstmt.executeUpdate();
            if (1==pstmt.executeUpdate()) {
                System.out.println("Inserted successfully");
            }
            else {
                System.out.println("Failed to insert");
            }

//            String sql = "INSERT INTO student VALUES"+id+", "+firstname+"+, "+lastname+", "+email+")";
//            int norec = stmt.executeUpdate(sql);
//            if (norec != 0) {
//                System.out.println("Inserted successfully");
//            }
//            else {
//                System.out.println("Failed to insert");
//            }
        }
        catch(ClassNotFoundException e) {
            e.printStackTrace();
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
        finally {
            try {
                stmt.close();
            }
            catch(SQLException e) {
                e.printStackTrace();
            }
            try {
                conn.close();
            }
            catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}