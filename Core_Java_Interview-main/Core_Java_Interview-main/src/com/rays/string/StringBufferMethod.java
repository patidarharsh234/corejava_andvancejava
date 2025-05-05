package com.rays.string;

public class StringBufferMethod {

    public static void main(String[] args) {

    	   //
        StringBuffer sb1 = new StringBuffer();
        sb1.append("patidarji");
        System.out.println("Capacity without passing string argument in strinbuffer: "+sb1.capacity());
        
        
        // Create a StringBuffer object with initial value "Kapil"
        StringBuffer sb = new StringBuffer("HarsH");
        System.out.println("stringBuffer Value: "+sb);

        // Append "dudhe" to the existing StringBuffer content
        sb.append("_paT");

        // Print the current content of the StringBuffer
        System.out.println("stringBufferValue With append: "+sb);

        // Print the length of the StringBuffer
        System.out.println("Length: " + sb.length());

        // Print the current capacity of the StringBuffer //append ki di hui capicity khatam hone pr bhi add karate jaoge string ko to +1 se increment hote jayega or new aapend karaoge to us time jo capitity hogi +1 hote hote vo hi old capacity hogi. 
        System.out.println("Capacity with passing string argument in strinbuffer: " + sb.capacity());//:-all new append pr formula applay cpicity kahatm hone pr (oldcapacity*2)+2=newcapicity.

        // Print the character at index 1 (zero-based index)
        System.out.println("Given Character of IndexNo: "+sb.charAt(1));

        // Find the index of the substring "dudhe" within the StringBuffer
        System.out.println("Given IndexNo of Character: "+sb.indexOf("p"));

        // Replace characters from index 1 to 5 (exclusive) with "helloo"
        System.out.println("replace: "+sb.replace(1,4, "yash"));//startindex ,givenLengthNo:-jha tk change
        
        sb.insert(9, "_patidar");//length le ra but Index mana jaye to(length-1)
		System.out.println("Insert: "+sb);
		
		//indexNo,lengthofvalue-1(Index)
		System.out.println("Delete: "+sb.delete(1, 17));

        // Reverse the content of the StringBuffer
        System.out.println(sb.reverse());
        
		
		
	

    }

}
