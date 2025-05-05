package colloectionOverriding_equals_HasCode;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

public class MarksheetTest {
public static void main(String[] args) {
	List l=new ArrayList();
	
	
	Marksheet M=new Marksheet("harsh");//contains sirf object ko match krta values ko nahi
	
	Marksheet M2=new Marksheet("patidar");
	
	Marksheet M3=new Marksheet("patid");
	l.add(M);
	l.add(M2);
	l.add(M3);
	
	//System.out.println(l.contains(M));
	//System.out.println(l.remove(M));
	System.out.println(l.contains(M));//(!(obj instanceof Employee))equals ki es condition 
	                                  //pr work krta=contains
	
	HashMap map=new HashMap();
	map.put(M,"harsh");
	map.put(M2, "80");
	Collection values=map.values();
	System.out.println(values);
	
	
	
	
}
}
