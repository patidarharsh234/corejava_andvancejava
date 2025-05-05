package junittest;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.in.junit.UserBean;
import com.in.junit.UserModel;

public class TestDelete {

	@Test
	public void delete() throws Exception {

		int i = UserModel.delete(1);
		assertEquals(1, i);

		UserBean bean = UserModel.findByPk(1);

		// assertNull(bean);
		// assertNotNull(bean);
		assertTrue(bean == null);
		assertTrue(bean != null);

	}

}
