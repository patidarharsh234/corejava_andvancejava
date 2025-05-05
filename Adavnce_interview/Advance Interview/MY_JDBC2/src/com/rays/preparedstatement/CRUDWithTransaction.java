package com.rays.preparedstatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CRUDWithTransaction {
	public static void main(String[] args) throws Exception {

		//add(13,"joy",4000,"30/06/1995");
		updateDelete("parmindar", 30000, "30/06/1995", 13);
		getList("name");
	}
//=======================================================================
	static String LoadDriver = "com.mysql.cj.jdbc.Driver";
	static String mysqlUrl = "jdbc:mysql://localhost:3306/advanceinterview";
	static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	static Date date;
//========================================================================
	public static void add(int id,String name,int sallary,String strDate ) {
		Connection conn = null;
		PreparedStatement ps = null;
		try {
			Class.forName(LoadDriver);
			conn = DriverManager.getConnection(mysqlUrl, "root", "root");
			conn.setAutoCommit(false);

			ps = conn.prepareStatement("insert into sqlcrud values(?,?,?,?)");
			ps.setInt(1, id);
			ps.setString(2, name);
			ps.setInt(3, sallary);
			date = sdf.parse(strDate);
			ps.setDate(4, new java.sql.Date(date.getTime()));

			int i = ps.executeUpdate();
			System.out.println("data add:" + i);
			conn.commit();

		} catch (Exception e) {
			try {
				conn.rollback();
			} catch (Exception e1) {
				System.out.println("Exception Come into RollBack Time" + e1.getMessage());
			}
			System.out.println("Meain Exception " + e.getMessage());
		} finally {
			try {
				if (conn != null) {
					conn.close();
				}
				if (ps != null) {
					ps.close();
				}
			} catch (Exception e) {
				System.out.println("Exception come on the connection.close Time :" + e.getMessage());
			}
		}

	}
	
//======================================================================	

	public static void updateDelete(String name, int sallary, String strDate, int id) {
		Connection conn = null;
		PreparedStatement ps = null;

		try {
			Class.forName(LoadDriver);
			conn = DriverManager.getConnection(mysqlUrl, "root", "root");

			conn.setAutoCommit(false);
//DELETED data Stretcher****************************************************************
//			 ps=conn.prepareStatement("DELETE FROM SQLCRUD WHERE ID=?");
//			 ps.setInt(1, id);
//***************************************************************************************
			
			
//Update data stretcher *****************************************************************
			ps = conn.prepareStatement("UPDATE SQLCRUD SET NAME=?,SALLARY=?,INTERDATE=? WHERE ID=?");
			ps.setString(1, name);
			ps.setInt(2, sallary);
			 date = sdf.parse(strDate);
			ps.setDate(3, new java.sql.Date(date.getTime()));
			ps.setInt(4, id);
//**********************************************************************************		

			int i = ps.executeUpdate();
			System.out.println("Data Update or Delete:" + i);
			conn.commit();
			
		} catch (Exception e) {
			try {
				conn.rollback();
			} catch (Exception e2) {
				System.out.println("Exception Come Into RollBack Time:" + e2.getMessage());
			}
			System.out.println("Mean Exception :" + e.getMessage());
		} finally {
			try {
				if (conn != null) {
					conn.close();
				}
				if (ps != null) {
					ps.close();
				}
			} catch (Exception e) {
				System.out.println("Exce come into connection closing time:" + e.getMessage());
			}
		}
	}

//=================================================================
	public static void getList(String name) throws Exception {

		Class.forName(LoadDriver);
		Connection conn = DriverManager.getConnection(mysqlUrl,"root","root");

		PreparedStatement ps = conn.prepareStatement("SELECT * FROM SQLCRUD");
		// PreparedStatement ps = conn.prepareStatement("SELECT * FROM SQLCRUD WHERE
		// NAME LIKE name "+name+"%");
		ResultSet rs = ps.executeQuery();
		
		while( rs.next()) {
			
			System.out.print("\t"+rs.getInt(1));
			System.out.print("\t"+rs.getString("name"));
			System.out.print("\t"+rs.getInt(3));
			System.out.print("\t"+rs.getDate(4));
			System.out.println();
		}
		
		try {
			conn.close();
			ps.close();
		}catch(Exception e) {
			System.out.println("Connection close Exception :"+e.getMessage());
		}

	}

}
