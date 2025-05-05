package junittest;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.in.junit.UserBean;
import com.in.junit.UserModel;

public class TestUpdate {

	@Test
	public void update() throws Exception {

		UserBean bean = UserModel.findByPk(1);

		bean.setName("pranshu");

		int i = UserModel.update(bean);
		
		assertEquals(1, i);

		bean = UserModel.findByPk(1);

		assertEquals("pranshu", bean.getName());

	}

}
