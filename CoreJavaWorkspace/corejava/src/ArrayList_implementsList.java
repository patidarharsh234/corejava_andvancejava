import java.util.ArrayList;

public class ArrayList_implementsList {
	public static void main(String[] args) {
		 ArrayList l= new ArrayList();
		 l.add("one");
		 l.add("two");
		 l.add("three");
		 
		 Integer i=new Integer(10);
		 l.add(i);
		 System.out.println(l);
		 
		 String valu=(String)l.get(2);
		 Integer valu2=(Integer)l.get(3);
		 System.out.println(valu);
		 System.out.println(valu2);
		 
	}

}
