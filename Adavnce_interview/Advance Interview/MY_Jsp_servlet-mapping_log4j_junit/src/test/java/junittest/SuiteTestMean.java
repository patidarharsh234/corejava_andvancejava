package junittest;

import junit.framework.TestSuite;

public class SuiteTestMean {
	public static void main(String[] args) {
		
	
	TestSuite suite=new TestSuite("Test All");
	suite.addTestSuite(Suite_TestCase1.class);
	suite.addTestSuite(Suite_TestCase2.class);
	
	junit.textui.TestRunner.run(suite);

	}
}
