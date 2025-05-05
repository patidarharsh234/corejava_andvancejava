package com.rays.callablestatement;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Types;

public class CallFunction {
	
	public static void main(String[] args)throws Exception {
		//function have return type and एक single value return करता है.
		//used  directly in sql query inside stored procedure.
		//purpose calculation and return value.
		//only take"IN"parameter.
		//Function को deterministic या nondeterministic declare करना होता है
		//REQUIRED: एक value return करना जरूरी है
		//"?"RETURN TYPE OF FUNCTION  =CALL square( "?" IN PARAMERTER(set parameter) )
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/advanceinterview","root","root");
		
		CallableStatement call=conn.prepareCall("{?=CALL square(?)}");
		
		call.registerOutParameter(1, Types.INTEGER); //  @getValue; -OUT parameter Ko register (1)
		call.setInt(2, 10); //SET @value=10;
		
		call.execute();
	
		System.out.println(call.getInt(1)); // select @getValue;
		
		
	}

}
