package in.co.rays.prepared1B.MarksheetDynamic;

import java.util.Iterator;
import java.util.List;

public class TestMarksheet {
	public static void main(String[] args) throws Exception {
		
	//	testAdd();
	//	testDelete();
	//	testNextPk();
	//	testsearch();
	//	testfindByRollno();
		testsearch1();
		
	}

	private static void testsearch1() throws Exception {
		MarksheetBean bean1=new MarksheetBean();
		bean1.setName("r");
		bean1.setRollno(101);
		MarksheetModel model= new MarksheetModel();
		List<MarksheetBean> list=model.search(bean1);
		
		Iterator<MarksheetBean> it= list.iterator();
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
		
	

	private static void testfindByRollno() throws Exception {
		MarksheetModel modle=new  MarksheetModel();
		MarksheetBean bean = modle.findByRollno(111);
		
		if(bean !=null) {
			System.out.println(bean.getId());
			System.out.println(bean.getName());
			System.out.println(bean.getRollno());
			System.out.println(bean.getPhy());
			System.out.println(bean.getChe());
			System.out.println(bean.getMath());
		}else{
			System.out.println("rollno not Exist....!!!");
		}
		
	}

	private static void testsearch() throws Exception {
		MarksheetModel model=new MarksheetModel();
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

	private static void testNextPk() throws Exception {
		MarksheetModel modle= new MarksheetModel();
		System.out.println("nextId="+modle.nextPk());
		
	}
	
	

	private static void testDelete() throws Exception {
	
		MarksheetModel model=new MarksheetModel();
		model.delete(5);
		
	}
	
	

	public static   void testAdd() throws Exception {
		MarksheetBean bean1=new MarksheetBean ();
		//bean1.setId(8);                                  //nextPk method se id Automatically leta rahega
		bean1.setName("4 furpandi");
		bean1.setRollno(109);
		bean1.setPhy(66);
		bean1.setChe(68);
		bean1.setMath(85);
		

		
		MarksheetModel model=new MarksheetModel();
	  	model.testAdd(bean1);
		
	}

}
