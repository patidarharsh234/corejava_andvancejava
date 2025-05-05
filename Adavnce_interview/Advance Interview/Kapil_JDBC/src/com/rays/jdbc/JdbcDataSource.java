package com.rays.jdbc;

import java.beans.PropertyVetoException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mchange.v2.c3p0.ComboPooledDataSource;
//SINGLE TUN CLASS.
public final class JdbcDataSource { //MAKE CLASS FINA 

	private static JdbcDataSource jds = null; //get SELF TYPE ATTRIBUTE AND MAKE STATIC FOR ALOCATED ONLY ONE TIME MEMORY ALLOCATED.

	private ComboPooledDataSource ds = null;

	private JdbcDataSource() { //CREATE PRIVATE CONSTRUCTOR.
		try {
			ds = new ComboPooledDataSource();
			ds.setDriverClass("com.mysql.cj.jdbc.Driver");
			ds.setJdbcUrl("jdbc:mysql://localhost:3306/advanceinterview");
			ds.setUser("root");
			ds.setPassword("root");
			ds.setInitialPoolSize(5);
			ds.setAcquireIncrement(5);
			ds.setMaxPoolSize(67);
		} catch (PropertyVetoException e) {
			e.printStackTrace();
		}
	}

	public static JdbcDataSource getInstance() {  //CREATE GET INSTANCE METHOD  RETURN THE INSTANCE OF THE SEAM TYPE OF CLASS
		if (jds == null) {
			jds = new JdbcDataSource();
		}
		return jds;

	}

	public static Connection getConnection() { //LIKE FECTORY DEGIN PATTERN

		try {
			return getInstance().ds.getConnection(); //CONNECTION OBJECT RETURN.
		} catch (SQLException e) {
			return null;
		}
	}

	public static void closeConnection(Connection conn, Statement stmt, ResultSet rs) {
		try {
			if (rs != null)
				rs.close();
			if (stmt != null)
				stmt.close();
			if (conn != null)
				conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static void closeConnection(Connection conn, Statement stmt) {
		closeConnection(conn, stmt, null);
	}

	public static void closeConnection(Connection conn) {
		closeConnection(conn, null, null);
	}
}
