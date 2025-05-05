package junittest;

import static org.junit.Assert.assertEquals;

import static org.junit.Assert.assertNotNull;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.in.junit.UserBean;
import com.in.junit.UserModel;

public class TestLifecycleOnCreatedMethod {
	
	private static UserModel model;
	private UserBean bean;
	private static final int TEST_ID = 1001;
	
	@BeforeClass
	public static void beforeClass() {
		System.out.println("@BeforeClass - Initializing Model...");
		model = new UserModel();
	}
	
	@Before
	public void before() throws Exception {
		System.out.println(" @Before - Deleting test record (if exists)...");

		// Ensure a fresh UserBean instance before each test
		bean = new UserBean();

		// Cleanup: Delete any existing test record
		model.delete(TEST_ID);
	}
	
	@Test
	public void test1() throws Exception {
		System.out.println(" @Test_1 - Adding a User...");

		// Set values for the bean
		bean.setId(TEST_ID);
		bean.setName("John Doe");
		bean.setSalary(5000);

		model.add(bean); // Insert user record

		// Verify record is added
		UserBean addedBean = model.findByPk(TEST_ID);
		assertNotNull(" Record not found after addition!", addedBean);
		System.out.println("Record added successfully!");
	}
	
	
	@Test
	public void test2() throws Exception {
		
		System.out.println(" @Test_2 - Updating User Record...");

		// Ensure user is added before updating
		bean.setId(TEST_ID);
		bean.setName("John Doe");
		bean.setSalary(5000);
		//ADD
		model.add(bean);

		
		// Get Added data
		bean = model.findByPk(TEST_ID);
		//  updating get data
		bean.setName("John Updated");
		bean.setSalary(7000);
		// UPDATE
		model.update(bean);

		// Verify update
	   bean = model.findByPk(TEST_ID);
		
		assertNotNull(" Record not found after update!", bean);
		assertEquals(" Name update failed!", "John Updated", bean.getName());
		assertEquals(" Salary update failed!", 7000, bean.getSalary());

		System.out.println("Record updated successfully!");
	}
	
	@After
	public void  after() throws Exception {
		
		System.out.println("@After - Cleaning up test data...");
		model.delete(TEST_ID); // Cleanup to ensure isolation
		bean = null;
	}
	
	@AfterClass
	public static void  afterClass() {
		
		System.out.println(" @AfterClass - Cleaning up resources...");
		model = null;
	}
	
	

}
