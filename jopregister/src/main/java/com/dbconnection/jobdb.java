package com.dbconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class jobdb {
	
	private static final String URL = "jdbc:mysql://localhost:3306/jobregister";
    private static final String USER = "root";  
    private static final String PASSWORD = "shiva@localhost"; // Check if this password is correct

    public static Connection getConnection() {
        Connection con = null;
        try {
            // Load MySQL JDBC Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Connect to Database
            con = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println(" Database Connected Successfully!");
        } catch (ClassNotFoundException e) {
            System.out.println(" MySQL Driver not found!");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println(" Database Connection Failed! Check MySQL credentials and server status.");
            e.printStackTrace();
        }
        return con;
    }


}
