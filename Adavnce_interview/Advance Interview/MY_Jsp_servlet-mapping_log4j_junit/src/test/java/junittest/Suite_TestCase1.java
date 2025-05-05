package junittest;



import org.junit.Test;

import com.in.junit.UserBean;
import com.in.junit.UserModel;

import junit.framework.TestCase;

public class Suite_TestCase1 extends TestCase {
	@Test
	public void testFindByPk() throws Exception {

		UserBean bean = UserModel.findByPk(1);

		assertNotNull("user is null", bean);

	}
}