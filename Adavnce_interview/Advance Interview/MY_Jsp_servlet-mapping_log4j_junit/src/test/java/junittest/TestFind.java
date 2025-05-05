package junittest;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.in.junit.UserBean;
import com.in.junit.UserModel;

public class TestFind {
	
	@Test
	public void testFind() throws Exception {

		UserBean bean = UserModel.findByPk(3);

	    assertEquals("yash patidar", bean.getName());

	}

}
