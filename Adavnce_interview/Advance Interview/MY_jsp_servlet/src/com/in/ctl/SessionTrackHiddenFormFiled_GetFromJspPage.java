package com.in.ctl;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/sessionTreackHiddenFormFiled")
public class SessionTrackHiddenFormFiled_GetFromJspPage extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String SessionId = req.getParameter("jsessionid");

		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		out.write("<Html><Body>");
		out.write("<h1 align=center>get the session from Hidden Form Filed ==>'" + SessionId + "'</h1>");
		out.write("<h2 align=center  >Tank You complet session Tracing</h2><br><br>");

		HttpSession session = req.getSession(false);
	
		
	    out.write("<h2>get Session and pass _false_ and Check correct or note ==>'" + session.getId() + "'</h1>");
		
	    HttpSession session2 = req.getSession(true);
	    
	    out.write("<h2>get Session and pass _true_ and Check correct or note ==>'" + session2.getId() + "'</h1>");
	    
	    out.write("<h3 >NOW OLD Session Is Invaidate..!!!</h1>");
	    session.invalidate();
	    
	    //session Invalidate krne ke bad
	    HttpSession session3 = req.getSession(false);//es point pr id get karunga to nullpointer Exception aayegi
	    //because ye old session hota to continue kr deta but new nhi gerate krta es liye session id null dega.
	    
	    
	    
		HttpSession session4 = req.getSession(true);
		out.write("<h3 >now new session genrated ==>'" + session4.getId() + "'</h1>");
		out.write("</Body></Html>");

	}
}
