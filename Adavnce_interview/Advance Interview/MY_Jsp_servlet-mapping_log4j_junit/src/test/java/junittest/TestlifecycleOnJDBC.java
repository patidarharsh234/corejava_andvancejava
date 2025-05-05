package junittest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import org.junit.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.sql.*;

public class TestlifecycleOnJDBC {

	private static Connection conn;
	private static Statement st;
	private static PreparedStatement pre;
	private static ResultSet rs;
	private Savepoint save;

	@BeforeClass
	public static void setUpDataBase() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/hibearnate", "root", "root");
		conn.setAutoCommit(false);
	}

	@Before
	public void setUpPrepared() throws Exception {
		save = conn.setSavepoint();//Partial rollback scenarios (e.g., inserting multiple rows, but rolling back only failed ones).
		st = conn.createStatement(); // if you use statement then use this object.

	}

	@Test
	public void add() throws Exception {
		int id = 1;
		String name = "harsh";
		int salary = 5000;

		pre = conn.prepareStatement("INSERT INTO ACCOUNTDTO(ID,NAME,SALARY) VALUES(?,?,?) ");
		pre.setInt(1, id);
		pre.setString(2, name);
		pre.setInt(3, salary);
		int rowInserted = pre.executeUpdate();
		
		assertEquals("Add Filed :", 1, rowInserted);

	}

	@Test
	public void update() throws Exception {
		int id = 10;
		String updateName = "yash patidar";
		int updateSalary = 10000;

		// ADD
		pre = conn.prepareStatement("INSERT INTO ACCOUNTDTO(ID,NAME,SALARY) VALUES(?,?,?) ");
		pre.setInt(1, id);
		pre.setString(2, "Harsh");
		pre.setInt(3, 5000);
		int rowInserted = pre.executeUpdate();
		assertEquals("Add Filed :", 1, rowInserted);

		// UPDATE
		pre = conn.prepareStatement("UPDATE  ACCOUNTDTO SET NAME=?,SALARY=? WHERE ID=?");
		pre.setString(1, updateName);
		pre.setInt(2, updateSalary);
		pre.setInt(3, id);

		int updateRow = pre.executeUpdate();
		assertNotNull("Data Note Update :", updateRow);
		assertEquals("Update Filed :", 1, updateRow);

		// FIND BY ID
		pre = conn.prepareStatement("SELECT * FROM ACCOUNTDTO WHERE ID=?");
		pre.setInt(1, id);
		rs = pre.executeQuery();

		while (rs.next()) {
			assertEquals("Name Update Faild..!", "yash patidar", rs.getNString("name"));
			assertEquals("salary Update Faild..!", 10000, rs.getInt("salary"));

		}

	}

	@Test
	public void findById() throws Exception {
		int id = 4;
		// FIND BY ID
		try (PreparedStatement pre = conn.prepareStatement("SELECT * FROM ACCOUNTDTO WHERE ID=?")) {
			pre.setInt(1, id);
			rs = pre.executeQuery();

			assertTrue(rs.next());
			assertEquals("Find Name  Faild..!", "shivani patidar", rs.getString("name"));
			assertEquals("Find salary Faild..!", 2000, rs.getInt("salary"));

		}

	}

	@After
	public void rollbackTransaction() {
		
		        try {
		            if (save != null) {
		                conn.rollback(save); // Rollback only to the savepoint
		            } else {
		                conn.rollback(); // Full rollback if savepoint is missing
		            }
		        } catch (SQLException e) {
		            System.out.println("Transaction Rollback Exception: " + e.getMessage());
		        }
		    }

	@AfterClass
	public static void closeDataBase() throws Exception {

		if (conn != null) {
			conn.close();
		}
		if (pre != null) {
			pre.close();
		}
		if (st != null) {
			st.close();
		}
		if (rs != null) {
			rs.close();
		}

	}

}
