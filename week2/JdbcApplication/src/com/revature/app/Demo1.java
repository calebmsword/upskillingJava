package com.revature.app;

import java.sql.*;

public class Demo1 {
    public static void main(String[] args) {
        String driver = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://localhost:5432/nameOfTable";
        String username = "username";
        String password = "password";

        try {
            Class.forName(driver);
            Connection conn = DriverManager.getConnection(url, username, password);
            System.out.println("Connection "+conn);
            Statement stmt = conn.createStatement();
            String sql = "SELECT * from nameOfTable";
            ResultSet rs = stmt.executeQuery(sql);
            while(rs.next()) {
                int slno = rs.getInt(1);
                String fn = rs.getString("firstname");
                String ln = rs.getString("lastname");
                String em = rs.getString("email");
                System.out.println(slno+" - "+fn+" - "+ln+" - "+em);
            }
            rs.close();
            stmt.close();
            conn.close();
        }
        catch(ClassNotFoundException e) {
            e.printStackTrace();
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
