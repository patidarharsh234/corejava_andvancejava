package com.in.ctl;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/sessionTrancing")
public class sesseionTrackingByDefultGetInBrowserCooki_AndURLRewriting extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		HttpSession session = req.getSession(true);
		String u = resp.encodeURL("/MY_jsp_servlet/urlrewritingpage.jsp");

		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();

		out.write("<Html><Body>");
		out.write("<h1>Session Tracking with cookie By default </h1>");
		out.write("<p>inspect the browser and check Application Menu and You can see cookie</p> <br><br>");
		out.write("<h2>Now  Track Using UrlRewriting Click This Link</h2>");
		out.write("<h3>Firt you can  Disable Cooke in Browser</h3>");
		out.write("<a href='"+u+"'>Read URL REWRITING </a>");
		
		out.write("</Body></Html>");

	}

}
