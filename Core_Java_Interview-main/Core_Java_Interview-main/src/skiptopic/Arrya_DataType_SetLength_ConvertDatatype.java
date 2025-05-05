package skiptopic;

import java.util.Iterator;

import com.javabasics.ForEach;

public class Arrya_DataType_SetLength_ConvertDatatype {
public static void main(String[] args) {

//All types convert into string	
	
	System.out.println("-------Start String  TO Int-------");
//1. Int convert String And String_Array	
    int g=5000;
 
 String f= String.valueOf(g);
 System.out.println("conver int to string:-"+f);
 
 String[] s=String.valueOf(g).split("");
 

	for(int i =0; i<f.length(); i+=1) {
		s[i]=String.valueOf(f.charAt(i));
	}
	
	System.out.println("convert int in the string[]:--");
	for (String string : s) {
		System.out.println(string);
	}
	
System.out.println("------------------------");
	
	
//2. IntArray Convert String And String_Array	
	
   
    int[] intArray = {5, 0, 0, 0}; //  int array

    // Convert int[] to a single String
    StringBuilder sb = new StringBuilder();
    for (int num : intArray) {
        sb.append(num);
    }
    String singleString = sb.toString();

    // Convert int[] to String[]
    String[] stringArray = new String[intArray.length];
    for (int i = 0; i < intArray.length; i++) {
        stringArray[i] = String.valueOf(intArray[i]);
    }

    // Print the single String
    System.out.println("Convert int[] to Single String:--" + singleString);

    // Print the String[] array
    System.out.println("Convert int[] into String []:--");
    for (String str : stringArray) {
        System.out.println(str);
    }
	
    
    
    
    System.out.println("---------START String  TO Character---------");
    //3. char convert into single string:-
    
    
    char singleChar = 'H';   
    
    String singlesString = String.valueOf(singleChar);  // or String singleString = "" + singleChar;
  
  

    //4. char array:-convert  String And String Array
    char[] charArray = {'H', 'e', 'l', 'l', 'o'};
    

   
    String combinedString = new String(charArray); // Convert char[] to a single String

    
    // Convert char[] to String[]
    String[] stringsArray = new String[charArray.length];
    for (int i = 0; i < charArray.length; i++) {
        stringsArray[i] = String.valueOf(charArray[i]);
    }

    
    
    // Print the results
    System.out.println("Single String from char: " + singlesString);
    System.out.println("String from char[]: " + combinedString);
    System.out.println("String [] from char[]:--");
    for (String str : stringsArray) {
        System.out.println(str);
    }
	
	
  System.out.println("-----START Interger  TO String-------");  
 //Interger:==
    
   // 1. string convert int And int_Array
    String str = "12345";

    //  String to int
    int singleInt = Integer.parseInt(str);

    //  String to int[]
    int[] intArrayFromString = new int[str.length()];
    for (int i = 0; i < str.length(); i++) {
    	intArrayFromString[i] = Character.getNumericValue(str.charAt(i));
    }

    // Print the results
    System.out.println(" int from String:- " + singleInt);
    System.out.println("int [] from String:");
    for (int num : intArrayFromString) {
        System.out.println(num);
    }
    
    System.out.println("-------------");
    
    
   // 2.  string array convert int And int_Array:-
    String[] strArray = {"10", "20", "30", "40", "50"};

    
    //  String[] to int
    StringBuilder sb1 = new StringBuilder();
    for (String str1 : strArray) {
        sb1.append(str1);
        
    }
    int IntFromStringArray = Integer.parseInt(sb1.toString());

    
    //  String[] to int[]
    int[] intArrayFromStringArray = new int[strArray.length];
    for (int i = 0; i < strArray.length; i++) {
    	intArrayFromStringArray[i] = Integer.parseInt(strArray[i]);
    }

    // Print the results
    System.out.println("Single int from String []: " + IntFromStringArray);
    System.out.println("int [] from String []:");
    for (int num : intArrayFromStringArray) {
        System.out.println(num);
    }
	
    
    System.out.println("---------START Int  TO Character-------");
    
 // 3.  Character  convert int And int_Array:-
    char charaToInt = '4';

    
    int IntToChar = Character.getNumericValue(charaToInt);//char To int convert
    
    
    int[] singleCharArray = {Character.getNumericValue(charaToInt)};//  char to int[] convert
    
    System.out.println("char To Int:-"+IntToChar);
    System.out.println("char To Int[]:-");
    for (int num : singleCharArray) {
        System.out.println(num);
    }
    
    
    //4. char array:-convert  int And int Array 
    
         //char Array:-int
    char[] charArray_Int_IntArray = {'2', '4', '4', '6', '8'};

        
    StringBuilder sb3 = new StringBuilder(); 
    for (char c : charArray_Int_IntArray) {
    	sb3.append(c);
    }
    int int_charArray = Integer.parseInt(sb3.toString()); // char[] to a int
    
   
    
    
    int[] intArray_charArray = new int[charArray_Int_IntArray.length];//char[] to int[]
    for (int i = 0; i < charArray_Int_IntArray.length; i++) {
    	intArray_charArray[i] = Character.getNumericValue(charArray_Int_IntArray[i]);
    }
    
    
    // Print the results
    System.out.println("char [] To Int:- " + int_charArray);
    System.out.println("char [] To Int []:-");
    for (int num : intArray_charArray) {
        System.out.println(num);
    }
    
    
    System.out.println("-----START Character TO String-------");   
    // 1. string convert char And char_Array
    String string_char_charArray = "jello";

  
    char char_TO_String = string_char_charArray.charAt(0); 
    
    char[] charArray_To_string = string_char_charArray.toCharArray();
    
    System.out.println(" String To Char:- " + char_TO_String);
    System.out.println(" String TO char[]:-");
    for (char c : charArray_To_string) {
        System.out.println(c);
    }
    
    System.out.println("----------------");
    
    // 2. string Array convert char_Array
          //seam of uper code:-
    
    
    
    System.out.println("-----START Character TO int-------"); 
    //3. int convert cahar And charArray 
    
    
    int number = 1234;
    
    //single character
    char IntConvertCahr = (char) (number % 10 + '0'); // Converts the last digit to a char
	
    
    //char Array to integer(String me convert karo first int se then convert char) 
    String firstConvString_Number = Integer.toString(number);
    char[] char_Array = firstConvString_Number.toCharArray();
    
    
    
    //4. int[] convert  charArray 
    
    int[] int_Array1 = {1, 2, 3, 4, 5};

    // Convert int array to char array
    char[] char_Array1 = new char[int_Array1.length];
    for (int i = 0; i < int_Array1.length; i++) {
    	char_Array1[i] = (char) (int_Array1[i] + '0');  // Converts each int to corresponding char
    }
    
    
	}
 
}
