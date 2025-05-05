package com.rays.callablestatement;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Types;

public class Call_InOut_StoredProcedure {

	public static void main(String[] args) throws Exception {
		//Register the OUT parameter mens get only one value.
        //sql syntex :-{CALL INOUT_parameter(?)}
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/advanceinterview", "root", "root");

		CallableStatement call = conn.prepareCall("{CALL INOUT_parameter(?)}");

		call.setInt(1, 3); // "1" As @value And "3" As value Finall=>SET @value=3 ; "3 is id" one parameter set bhi.

		call.registerOutParameter(1, Types.INTEGER); // "1" As @value ; one parameter get ke liye set bhi.
														// @value
		call.execute();
		

		 System.out.println(call.getInt(1)); //"getINT" AS SELECT,"1" As @value  Finally=>SELECT @value;
		
		
	

	}

}
