package variables_Operaters_2A;

public class Unary_Prefix_postfix {
	public static void main(String[] args) {
		int i=1;
		int a=i++;
		int b=++i;
		int c=++i;
		int d=i++;
		int e=i;
		System.out.println(a+" "+b+" "+c+" "+d+" "+e);
		
		
		int j=1;
		System.out.println(j++);
		System.out.println(j++);
		System.out.println(j);
		System.out.println(j--);
		System.out.println(--j);
		System.out.println(j++);
		System.out.println(j);
	}

}
