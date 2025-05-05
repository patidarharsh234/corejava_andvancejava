package string_StringBuffer_java.lang;

public class StringBuffer_1 {
	public static void main(String[] args) {
		StringBuffer sb= new StringBuffer("harsh patidar");
		sb.append("vardhan");
		
		System.out.println("Lenth:-" +sb.length());
		
		System.out.println("Capacity:-"+sb.capacity());
		
		System.out.println("char at:-" +sb.charAt(2));
		
		System.out.println("index of:-" +sb.indexOf("p"));
		
		System.out.println("replace:-" + sb.replace(0, 3, "patidar"));
		
		System.out.println("revers:-" +sb.reverse());
  
	}

}
