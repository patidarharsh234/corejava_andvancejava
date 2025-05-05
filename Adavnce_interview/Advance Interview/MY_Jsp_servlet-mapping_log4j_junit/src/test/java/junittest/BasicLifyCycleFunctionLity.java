package junittest;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class BasicLifyCycleFunctionLity {
	
	@BeforeClass
	public static void beforeClass(){
		System.out.println("BEFORECLASS");
	}
	
	@Before
	public  void before(){
		System.out.println("BEFORE");
	}
	
	@Test
	public  void test1(){
		System.out.println("TEST1");
	}
	
	@Test
	public  void test2(){
		System.out.println("TEST2");
	}
	
	@After
	public  void after(){
		System.out.println("AFTER");
	}
	
	@AfterClass
	public static void afterClass(){
		System.out.println("AFTERCLASS");
	}

}
