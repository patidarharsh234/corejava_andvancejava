package com.rays.callablestatement;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Types;

public class StoredProcedure_INOUT_GetOUTParameter_GetRow {

	public static void main(String[] args) throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/advanceinterview", "root", "root");

		CallableStatement call = conn.prepareCall("{CALL INOUT_parameter_getRow(?)}");

		// INOUT parameter

		// "SET @value=3;" ,@value is 1  ,IN parameter 3000 is sallary
		call.setInt(1, 3000);

		// also " @value is 1" for OUT parameter
		call.registerOutParameter(1, Types.INTEGER);

		call.execute();

		ResultSet rs = call.getResultSet();

		if (call.getInt(1) != -1) {
			while (rs.next()) {

				System.out.print("\t" + rs.getInt(1));
				System.out.print("\t" + rs.getString(2));
				System.out.print("\t" + rs.getInt(3));
				System.out.println();

			}
		}
		// "SELECT @value" get the OUT parameter.
		System.out.println("OUT parameter :" + call.getInt(1));
	}

}
