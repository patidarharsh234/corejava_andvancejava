package test.jdbclass.use;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import in.co.rays.jdbcDatasource.Class.fix.connectionmethods.JdbcDataSource;
import in.co.rays.prepared1B.MarksheetDynamic.MarksheetBean;

public class MarksheetModeal1 {
	
	public List<MarksheetBean> search() throws Exception {
		    
		Connection conn=JdbcDataSource.getConnection();

		PreparedStatement ps = conn.prepareCall("select * from marksheet");
		ResultSet rs = ps.executeQuery();

		ArrayList<MarksheetBean> list = new ArrayList<MarksheetBean>();

		while (rs.next()) {
			MarksheetBean bean = new MarksheetBean();
			bean.setId(rs.getInt(1));
			bean.setName(rs.getString(2));
			bean.setRollno(rs.getInt(3));
			bean.setPhy(rs.getInt(4));
			bean.setChe(rs.getInt(5));
			bean.setMath(rs.getInt(6));
			list.add(bean);
		}
		return list;

	}

}
