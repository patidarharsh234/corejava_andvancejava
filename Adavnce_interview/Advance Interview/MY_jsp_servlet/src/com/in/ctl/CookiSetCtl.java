package com.in.ctl;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = { "/setcookie" })
public class CookiSetCtl extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// how to set
		// data:-http://localhost:4200/jsp_servlet/setcookie?key=Harsh&value=patidar&address=mumbai&address=kolkata
		PrintWriter out = resp.getWriter();

		String key = req.getParameter("key");
		String value = req.getParameter("value");
		Cookie c = new Cookie(key, value);
		resp.addCookie(c);

		resp.setContentType("text/HTML");
		out.write("<html><body>");
		out.write("<p>cookies is successfull set ..!!</p>");

		String[] add = req.getParameterValues("address");
		for (String string : add) {
			out.println("<h3>addres get values(using req.getParametervalues): '" + string + "'");
            out.println("<br>");
		}

		out.write("</body></html>");

	}

}
