package junittest;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.in.junit.UserBean;
import com.in.junit.UserModel;

public class TestAdd {

	@Test
	public void testAdd() throws Exception {

		UserBean bean = new UserBean();
		bean.setId(5);
		bean.setName("Harsh");
		bean.setSalary(7000);

		UserModel model = new UserModel();

		int i = model.add(bean);

		assertEquals("Data Added :", 1, i);

	}

}
