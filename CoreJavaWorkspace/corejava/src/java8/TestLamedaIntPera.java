package java8;

import java8.LamdaParameter.HelloInt;
import java8.LamdaParameter.HelloInt2;

public class TestLamedaIntPera {
	public static void main(String[] args) {
		HelloInt fan1=()->{
			System.out.println("hello brother");
		};
		fan1.say1();
		
		
		
			
	HelloInt2 fan=(a,b)->{
		int c=a+b;
		
		System.out.println(c);
	};
	fan.say(10, 40);

}
}