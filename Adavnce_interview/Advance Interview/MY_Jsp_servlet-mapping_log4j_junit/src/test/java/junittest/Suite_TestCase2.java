package junittest;



import org.junit.Test;

import com.in.junit.UserBean;
import com.in.junit.UserModel;

import junit.framework.TestCase;

public class Suite_TestCase2 extends TestCase {

	@Test
	public void testFindByPk() throws Exception {

		UserBean bean = UserModel.findByPk(7);

		assertNull("user is not null", bean);
		// assertFalse(bean == null);
		// assertTrue("is not true", bean == null)
	}
}
