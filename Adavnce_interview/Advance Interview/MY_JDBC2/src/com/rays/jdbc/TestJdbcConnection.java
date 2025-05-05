package com.rays.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;


public class TestJdbcConnection {
	public static void main(String[] args) {
		Connection conn = null;

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/advanceinterview", "root", "root");
			System.out.println("connection stabless...!!");

		} catch (Exception e) {
			System.out.println("Error  ->  " + e.getMessage());
			System.out.println("Cause  ->  " + e.getCause());
	
		}

	}

}
