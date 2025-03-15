package com.PG.Helper;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class Helper {
	
	 private static final String URL = "jdbc:mysql://localhost:3306/pg?useSSL=false";
	    private static final String USER = "root";
	    private static final String PASSWORD = "orvil@1026";
	    private static Connection connection;

	    // Load the driver and establish a single connection
	    static {
	        try {
	            Class.forName("com.mysql.cj.jdbc.Driver");
	            connection = DriverManager.getConnection(URL, USER, PASSWORD);
	        } catch (ClassNotFoundException | SQLException e) {
	            e.printStackTrace();
	            throw new RuntimeException("Database connection failed!");
	        }
	    }

	    // Get PreparedStatement (No new connection each time)
	    public static PreparedStatement getPreparedStatement(String sql) throws SQLException {
	        return connection.prepareStatement(sql);
	    }

	    // Close the connection when application shuts down
	    public static void closeConnection() {
	        try {
	            if (connection != null && !connection.isClosed()) {
	                connection.close();
	            }
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	    }

}
