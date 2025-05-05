package com.rays.statment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

import java.sql.Statement;

public class CRUDWithTransactionClass {

	public static void main(String[] args) throws Exception {
		// updateAndDelete() ;
		System.out.println(add());
		getlist();
	}

	static String loadDriverClass = "com.mysql.cj.jdbc.Driver";
	static String mysqlURL = "jdbc:mysql://localhost:3306/advanceinterview";

//============================================================================
	public static int add() {
		Connection conn = null;
		Statement stmt = null;
		int i = 0;
		try {
			// "Create /alter /Drop"
			// "create table sqlcrud2(id int ,name varchar(300),salary int )"

			String add = "insert into sqlcrud values(6,'Rosan',40000,'2024-04-30')";
			// String add2="insert into sqlcrud values(7,'sunidhi',40000,'2024-05-25')";

			Class.forName(loadDriverClass);
			conn = DriverManager.getConnection(mysqlURL, "root", "root");

			conn.setAutoCommit(false);

			stmt = conn.createStatement();

			i = stmt.executeUpdate(add);
			// i = stmt.executeUpdate(add2);

			conn.commit();

		} catch (Exception e) {
			try {
				conn.rollback();
			} catch (Exception roll) {
				System.out.println("rollback time exception :" + roll.getMessage());
			}
			e.printStackTrace();
		} finally {
			try {
				if (stmt != null) {
					stmt.close();
				}
				if (conn != null) {
					conn.close();
				}
			} catch (Exception e) {
				System.out.println("connection close time exception :" + e.getMessage());
			}
		}
		return i;

	}

//================================================================================	
	static String delete = "DELETE FROM sqlcrud where id=6;";
	static String delete2 = "DELETE FROM sqlcrud where id=7;";
	static String update = "update sqlcrud set name='jaya',sallary=5000,interdate='2024-01-30' where id=2;";

	public static void updateAndDelete() {

		Connection conn = null;
		Statement stmt = null;
		int i = 0;

		try {

			Class.forName(loadDriverClass);
			conn = DriverManager.getConnection(mysqlURL, "root", "root");
			
			conn.setAutoCommit(false);// call krne pr ab manually commit krna hoga.

			stmt = conn.createStatement();
			i = stmt.executeUpdate(delete);

			conn.commit();// manually commit
		} catch (Exception e) {
			try {
				conn.rollback(); // RollBack exception aane pr.
			} catch (Exception e1) {
				System.out.println("rollback me exception:" + e1.getMessage());
			}

			System.out.println("exception :" + e.getMessage());
		} finally {
			try {
				if (conn != null) {
					conn.close();
				}
				if (stmt != null) {
					stmt.close();
				}
			} catch (Exception e) {
				System.out.println("Exception come into close connection" + e.getMessage());
			}
		}

		System.out.println(i);
	}

//=======================================================================================
	public static void getlist() throws ClassNotFoundException, Exception {
		Class.forName(loadDriverClass);
		Connection conn = DriverManager.getConnection(mysqlURL, "root", "root");
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery("select * from sqlcrud");
		while (rs.next()) {
			System.out.print(rs.getInt(1));
			System.out.print("\t" + rs.getString("name"));
			System.out.print("\t" + rs.getInt(3));
			System.out.println("\t" + rs.getDate(4));
		}

		try {
			conn.close();
			stmt.close();
		} catch (Exception e) {
			System.out.println("exception" + e.getMessage());
		}

	}

}
