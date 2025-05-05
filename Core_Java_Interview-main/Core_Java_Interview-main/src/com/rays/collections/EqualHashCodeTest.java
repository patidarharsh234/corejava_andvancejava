package com.rays.collections;

public class EqualHashCodeTest {
	public static void main(String[] args) {
		EqualHashCode e1 = new EqualHashCode(1, "FB", 120);
		EqualHashCode e2 = new EqualHashCode(1, "Ea", 120);
		EqualHashCode e3 = new EqualHashCode(1, "FB", 120);

		String s1 = new String("FB");
		String s2 = new String("Ea");
		
		//Internally work in hashcollection:- when data is ADD in the Hashcollection.
		System.out.println("------------ADD--------------------------------");
		System.out.println("find same type of hashcode buket index(Node) :");
		if (e1.hashCode() == e2.hashCode()) {
			System.out.println("yeas bucket index allrady there....!!");
			System.out.println("now compare there Instance and attributes (object) word by word)");
			if (s1.equals(s2)) {

				System.out.println(
						"find the equal instance and object(attribute):-then its duplicate value so its replace the old value into new in node..");
			} else {
				System.out.println("object are note equals:-" + s1 + " " + s2 + "  then create new NODE");
				System.out.println("bucket index seam but new NODE create inside same bucket index");
			}

		} else {
			System.out.println(" create new buket index : and create node insite bucket index ");

		}

//        System.out.println(e1.equals(e2));
//        System.out.println(e1.hashCode());
//        System.out.println(e2.hashCode());
		
		
		//Internally work in hashcollection:- when data is REMOVE in the Hashcollection.only equal method is working
		System.out.println("------------REMOVE--------------------------------");
		System.out.println("when you add e1 object but remove e3 then e3 check same object in hashcollection and REMOVE them.");
		if(e3.equals(e1)) {
			System.out.println("object is same Remove bouth object e3 and e1");
		}else {
			System.out.println("objects are note equale then remove only e3 object");
		}
	}
}
