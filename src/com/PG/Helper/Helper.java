package com.PG.Helper;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class Helper {
	
	private static Connection connection;
	private static PreparedStatement preparedstatement;
	
	public static PreparedStatement getPreparedStatement(String sql) throws SQLException, ClassNotFoundException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		String url =  "jdbc:mysql://localhost:3306/pg?useSSL=false";
		
		Helper.connection = DriverManager.getConnection(url, "root", "orvil@1026");
		
		Helper.preparedstatement = Helper.connection.prepareStatement(sql);
		return Helper.preparedstatement;
	}
	
	public static void close() throws SQLException{
		Helper.preparedstatement.close();
		Helper.connection.close();
	}

}
