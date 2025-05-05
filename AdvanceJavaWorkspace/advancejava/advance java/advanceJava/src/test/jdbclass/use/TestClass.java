package test.jdbclass.use;

import java.sql.Connection;
import java.util.Iterator;
import java.util.List;

import in.co.rays.jdbcDatasource.Class.fix.connectionmethods.JdbcDataSource;
import in.co.rays.prepared1B.MarksheetDynamic.MarksheetBean;
import in.co.rays.prepared1B.MarksheetDynamic.MarksheetModel;

public class TestClass {
	
	public static void main(String[] args) throws Exception {
		for(int i=1;i<=100;i++) {
			System.out.println("connection=" +i);
		testSearch();}
	  }

	private static void testSearch() throws Exception {
		
		MarksheetModeal1 model=new MarksheetModeal1();
		List<MarksheetBean> list=model.search();
		
	    Iterator<MarksheetBean> it=list.iterator();
	    while(it.hasNext()) {
	    	MarksheetBean bean=(MarksheetBean)it.next();
	    	System.out.print(bean.getId());
	    	System.out.print("\t"+bean.getName());
	    	System.out.print("\t"+bean.getRollno());
	    	System.out.print("\t"+bean.getPhy());
	    	System.out.print("\t"+bean.getChe());
	    	System.out.println("\t"+bean.getMath());
	    }
		
	}
	
	}


