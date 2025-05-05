package com.in.ctl;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = { "/getcookie" })
public class cookeGetCtl extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Cookie[] c = req.getCookies();
  
		
		PrintWriter out = resp.getWriter();
		resp.setContentType("text/HTML");
		out.write("<h3> get cookies..!! <h3>");
		for (Cookie cookie : c) {
			String name = cookie.getName();
			String value=cookie.getValue();
			out.println(name+"="+value);
			out.println("<br>");
			
		}
	}

}
