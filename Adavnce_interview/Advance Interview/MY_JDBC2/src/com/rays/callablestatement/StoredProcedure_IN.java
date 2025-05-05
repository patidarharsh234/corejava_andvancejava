package com.rays.callablestatement;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class StoredProcedure_IN {
	public static void main(String[] args) throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/advanceinterview", "root", "root");

		CallableStatement call = conn.prepareCall("{CALL In_parameter(?)}");

		call.setInt(1, 2);// 2 : is id

		call.execute();
		
		
		ResultSet rs = call.getResultSet();
		
		while(rs.next()) {
			System.out.print("\t"+rs.getInt(1));
			System.out.print("\t"+rs.getString("name"));
			System.out.print("\t"+rs.getInt(3));
			System.out.println();
		}

	}
}
