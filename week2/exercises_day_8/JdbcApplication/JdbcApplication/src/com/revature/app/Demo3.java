package com.revature.app;

import java.sql.*;
import java.util.Scanner;

public class Demo3 {
    public static void main(String[] args) {
        String driver = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://localhost:5432/nameOfTable";
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


        try {
            Class.forName(driver);
            conn = DriverManager.getConnection(url, username, password);
            System.out.println("Connection "+conn);

            String sql = "INSERT INTO student VALUES"+id+", "+firstname+"+, "+lastname+", "+email+")";
            int norec = stmt.executeUpdate(sql);
            if (norec != 0) {
                System.out.println("Inserted successfully");
            }
            else {
                System.out.println("Failed to insert");
            }
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
