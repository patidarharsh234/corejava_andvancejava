package in.co.rays.jdbcDatasource.Class.fix.connectionmethods;
import java.beans.PropertyVetoException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;

import javax.sql.CommonDataSource;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import com.mysql.cj.xdevapi.Statement;
import com.sun.jdi.connect.spi.ClosedConnectionException;

public final class JdbcDataSource {

        private static JdbcDataSource jds=null;
		private ComboPooledDataSource ds=null; //connection poll
		private JdbcDataSource() {
			ResourceBundle rb=ResourceBundle.getBundle("in.co.Resource.jdbc");
			try {
				
			ds=new ComboPooledDataSource();	
			ds.setDriverClass(rb.getString("driver"));
			ds.setJdbcUrl(rb.getString("url"));
			ds.setUser(rb.getString("user"));
			ds.setPassword(rb.getString("password"));
			ds.setInitialPoolSize(5);
			ds.setAcquireIncrement(5);
			ds.setMaxPoolSize(20);
			
				} catch (PropertyVetoException e) {
					e.printStackTrace();
				
				}
			
		}
		public static JdbcDataSource getInstance() {
			if(jds==null) {
				jds=new JdbcDataSource();
			}
			return jds;
			
		}
		public static Connection getConnection() {
			try {
				return getInstance().ds.getConnection();
				
			} catch (SQLException e) {
				return null;	
			}
		}
		public static void closeConnection(Connection conn,Statement stmt,ResultSet rs) {
		try {
			if(rs !=null)rs.close();
			if(stmt !=null)((Connection) stmt).close();
			if(conn !=null)conn.close();
		}catch(SQLException e) {
			e.printStackTrace();
		}


	}
		public static void closeConnection(Connection conn,Statement stmt)
		{
		closeConnection(conn,stmt,null);
		}
		public static void closeConnection(Connection conn) {
			closeConnection(conn,null,null);
		}
		}

