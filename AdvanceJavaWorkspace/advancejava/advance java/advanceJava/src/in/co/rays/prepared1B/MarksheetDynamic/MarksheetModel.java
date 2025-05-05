package in.co.rays.prepared1B.MarksheetDynamic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class MarksheetModel {

	public void testAdd(MarksheetBean bean) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentinformation", "root", "root");
		PreparedStatement ps = conn.prepareStatement("insert into  marksheet values(?,?,?,?,?,?)");

		ps.setInt(1, nextPk());
		ps.setString(2, bean.getName());
		ps.setInt(3, bean.getRollno());
		ps.setInt(4, bean.getPhy());
		ps.setInt(5, bean.getChe());
		ps.setInt(6, bean.getMath());

		int i = ps.executeUpdate();
		System.out.println("insert=" + i);
	}

	// delete method
	public void delete(int Id) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentinformation", "root", "root");
		PreparedStatement ps = conn.prepareCall("delete from marksheet where id=?");
		ps.setInt(1, Id);
		int i = ps.executeUpdate();
		System.out.println("delete=" + i);

	}

	// NextPk _Id set Automatically;
	public Integer nextPk() throws Exception {
		int pk = 0;
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentinformation", "root", "root");
		PreparedStatement ps = conn.prepareStatement("select max(id)from marksheet");
		ResultSet rs = ps.executeQuery();

		while (rs.next()) {
			pk = rs.getInt(1);

		}
		return pk + 1;

	}

	// serchMethod
	public List<MarksheetBean> search() throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentinformation", "root", "root");

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

	public MarksheetBean findByRollno(int rollno) throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentinformation", "root", "root");
		PreparedStatement ps = conn.prepareStatement("select * from marksheet where rollno=?");
		ps.setInt(1, rollno);

		ResultSet rs = ps.executeQuery();

		MarksheetBean bean = null;

		while (rs.next()) {
			bean = new MarksheetBean();
			bean.setId(rs.getInt(1));
			bean.setName(rs.getString(2));
			bean.setRollno(rs.getInt(3));
			bean.setPhy(rs.getInt(4));
			bean.setChe(rs.getInt(5));
			bean.setMath(rs.getInt(6));

		}

		return bean;

	}

	// serch by name or id etc.
	public List<MarksheetBean> search(MarksheetBean bean) throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentinformation", "root", "root");
		StringBuffer sql = new StringBuffer("select * from marksheet where 1=1");

      if(bean != null) {
			if (bean.getName() != null) {
				sql.append(" and name like '" + bean.getName() + "%'");
				System.out.println(sql);

			}
			if(bean.getRollno()>0) {
				sql.append(" and rollno ="+bean.getRollno());
			}
			//if(bean.getId())
			
		
		}
		PreparedStatement ps = conn.prepareStatement(sql.toString());
		ResultSet rs = ps.executeQuery();

		ArrayList<MarksheetBean> list = new ArrayList<MarksheetBean>();

		while (rs.next()) {
			bean = new MarksheetBean();
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
