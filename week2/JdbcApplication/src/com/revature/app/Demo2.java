package com.revature.app;

import java.sql.*;
import java.util.Scanner;

public class Demo2 {
    // Searching for a specific id
    public static void main(String[] args) throws SQLException {
        String driver = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306"; // might be nameOfDatabase
        String username = "root";
        String password = "root";

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the id of the student to display: ");
        int id = input.nextInt();

        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;


        try {
            Class.forName(driver);
            conn = DriverManager.getConnection(url, username, password);
            stmt = conn.createStatement();
            String sql = "SELECT * FROM student WHERE slno = "+id;
            rs = stmt.executeQuery(sql);
            if (rs.next()){
                int slno = id;
                String fn = rs.getString("firstname");
                String ln = rs.getString("lastname");
                String em = rs.getString("email");
                System.out.println(slno + " - " + fn + " " + ln + " "+em);
                System.out.println(rs.getInt(1)+" "+rs.getString(2)+ " "+ rs.getString(3)+ " "+ rs.getString(4));
            }
            else{
                System.out.println("No student exists with the id: "+id);
            }

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        finally {

            assert rs != null;
            rs.close();
            stmt.close();
            conn.close();
        }
    }
}