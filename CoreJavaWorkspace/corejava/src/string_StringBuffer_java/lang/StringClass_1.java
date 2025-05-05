package string_StringBuffer_java.lang;

public class StringClass_1 {
	public static void main(String[] args) {
		String name= "harshvardhan patidar";
		System.out.println("String Langth-" +name.length());
		
		System.out.println("7th character is-" +name.charAt(6));
		
		System.out.println("harsh index is-" +name.indexOf("harsh"));
		
		System.out.println("First i position-" +name.indexOf("r"));
		
		System.out.println("last i position-" +name.lastIndexOf("r"));
		
		System.out.println("a is replaced by b-" +name.replace("a","b"));
		
		System.out.println("all h is replaced by p-"+ name.replaceAll("h", "p"));
		
		System.out.println("chot harsh-"+ name.toLowerCase());
		
		System.out.println(name.toUpperCase());
		
		System.out.println(name.startsWith("har"));
		
		System.out.println(name.endsWith("dhan"));
		
		System.out.println(name.substring(5));
		
	}

}
