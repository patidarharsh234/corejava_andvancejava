package in.co.rays.ctl;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.mysql.cj.Session;

import in.co.rays.bean.UserBean;
import in.co.rays.model.UserModel;

@WebServlet("/LoginCtl")
public class LoginCtl extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("hyget");

		String op = req.getParameter("operation");
		// *logou hone pr likha aa jaye("logout successfully ")
		if (op != null) {
			HttpSession sess = req.getSession();
			sess.invalidate();
			req.setAttribute("success", "LogoutSuccessfully..!!");
		}

		RequestDispatcher rd = req.getRequestDispatcher("LoginView.jsp");
		rd.forward(req, resp);

	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String login = req.getParameter("login");
		String password = req.getParameter("password");
		String op = req.getParameter("operation");

		if (op.equals("SignIn")) {

			if (login.equals("") || password.equals("")) {

				if (login.equals("")) {

					req.setAttribute("requ1","Login Id is required");
				}
				if (password.equals("")) {
					req.setAttribute("requ2","Password is required");

				}

				RequestDispatcher rd = req.getRequestDispatcher("LoginView.jsp");
				rd.forward(req, resp);
			} else {

				try {
					UserBean bean = UserModel.authenticate(login, password);

					if (bean != null) {
						System.out.println("user valid");
						// resp.sendRedirect("WelcomeLoginCtl"); -->bina data ke liye

						/*
						 * (forward)-->data le kr jana request form me(new request aate hi purani req
						 * clean) RequestDispatcher rd= req.getRequestDispatcher("WelcomeLoginCtl");
						 * req.setAttribute("name", bean.getFirstName()); rd.forward(req, resp);
						 */

//*Set Session->data le kr jana request formate me but(time limit apply)(new request pr destroy nhi hota)
						HttpSession sess = req.getSession();
						sess.setAttribute("name", bean.getFirstName());
						sess.setMaxInactiveInterval(20); // *session time limit
						// resp.sendRedirect("WelcomeLoginCtl");

//*login->session ki help jha se logout kiya vahi se start ho login hone pr jb bich me hi session expire hone pr
						String uri = req.getParameter("uri");
						System.out.println(uri);

						if (uri.equalsIgnoreCase("null")) {
							resp.sendRedirect("WelcomeLoginCtl");

						} else {
							resp.sendRedirect(uri);

						}

						System.out.println("hypost");

					} else {
						System.out.println("user is invalid");
						// resp.sendRedirect("LoginView.jsp");

						RequestDispatcher rd = req.getRequestDispatcher("LoginView.jsp");
						req.setAttribute("error", "Invalid user LoginId & paswword");
						rd.forward(req, resp);

						/*
						 * HttpSession sess= req.getSession(); sess.setAttribute("error",
						 * "Invalid user LoginId & paswword"); sess.setMaxInactiveInterval(02);
						 * resp.sendRedirect("LoginView.jsp");
						 */

					}
				} catch (Exception e) {

					e.printStackTrace();
				}
			}

		}
		if (op.equals("SignUp")) {
			resp.sendRedirect("UserResgistrationCtl");
		}
	}

}
