package javaBasics_1E_Array;

public class Copy_array_charecter {

	public static void main(String[] args) {
		char[] copyFrom = {'a','b','c','d','e','f','g','h'};
		char[] copyTo= new char [5];
		System.arraycopy(copyFrom, 4, copyTo, 0, 3);
		//copyFrom-ka n4(index),cpoyTo-0(index),3(value)
		System.out.println(copyTo);
		
		
	}

}
