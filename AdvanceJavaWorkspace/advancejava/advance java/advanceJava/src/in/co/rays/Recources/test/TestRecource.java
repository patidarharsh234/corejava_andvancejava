package in.co.rays.Recources.test;

import java.util.ResourceBundle;

public class TestRecource {
	public static void main(String[] args) {
		ResourceBundle rs=  ResourceBundle.getBundle("in.co.Resource.app_hi");
		String value=rs.getString("hi");
		System.out.println(value);
	}

}
