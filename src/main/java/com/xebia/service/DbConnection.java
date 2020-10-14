package com.xebia.service;

import java.sql.Connection;
import java.sql.DriverManager;

public class DbConnection {
	
	public Connection getConnection() {
		Connection conn = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
		conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo", "root", "password");
		}catch(Exception e) {
			e.printStackTrace();
		}
		return conn;
	}

}
