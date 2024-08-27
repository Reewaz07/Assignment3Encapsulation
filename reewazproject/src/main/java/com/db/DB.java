package com.db;

import java.sql.Connection;
import java.sql.DriverManager;

public class DB {
	public static Connection getDB() {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			return DriverManager.getConnection(url,user,password);
			
		}
		
		
	}

}
