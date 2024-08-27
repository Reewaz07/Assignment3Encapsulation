package myPackage;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.http.HttpRequest;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/aaa")
public class Register extends HttpServlet
{	
@Override
protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
{
	String myname=req.getParameter("myname1");
	String myemail=req.getParameter("myemail1");
	
	System.out.println("Name1 :"+myname);
	System.out.println("Email :"+myname);
	
	resp.setContentType("text/html");
	PrintWriter out =resp.getWriter();
	out.print("Name:"+myname);
	out.print("Email:"+myemail);

}

}
