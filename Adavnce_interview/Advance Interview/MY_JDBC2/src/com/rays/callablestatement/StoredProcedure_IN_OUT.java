package com.rays.callablestatement;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Types;

public class StoredProcedure_IN_OUT {
	public static void main(String[] args) throws Exception {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/advanceinterview","root","root");
		
		CallableStatement call=   conn.prepareCall("{CALL In_Out_parameter(?,?)}");
		
		//SET @VAlue=3;,  @value is 1
		call.setInt(1, 3);//3 is id for storedprocedure table.
		
		//2 is assume:-@getVALUE 
		call.registerOutParameter(2, Types.VARCHAR);
		
		call.execute();
		
		//SELECT @getValue;
		System.out.println("out parameter :"+call.getString(2));
		
		
		
	}

}
