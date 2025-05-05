package in.co.rays.jdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Types;

public class CallToStored_procedure {
	public static void main(String[] args) throws Exception {
		
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/employ_department","root", "root");
		CallableStatement call=conn.prepareCall("call testemplcount(?)");
		call.registerOutParameter(1,Types.INTEGER);
		call.execute();
		int count=call.getInt(1);
		System.out.println("count "+count);
	}

}
