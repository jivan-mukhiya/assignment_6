package com.db;

import java.sql.Connection;
import java.sql.DriverManager;

public class DB {

	
	public static Connection getConnectio() {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		   return DriverManager.getConnection("jdbc:mysql://localhost:3306/webdb","root","root1");
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		return null;
	}
}
