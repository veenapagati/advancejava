package com.xworkz.king.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(loadOnStartup = 1,urlPatterns = "/states")
public class KingServlet extends HttpServlet {
	public  KingServlet() {
		System.out.println("runnimg no-args constr in  KingServlet.........");
	}
	@Override
	public void init() throws ServletException {
		System.out.println("running init in no-args constr......");
	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("running doget in webSeriesServlet........."); 
		System.out.println(Thread.currentThread().getName());
		String name=req.getParameter("kingName");
		String region=req.getParameter("region");
		String noOfQueens=req.getParameter("noOfQueens");
		String DOB=req.getParameter("DOB");
		String DOD =req.getParameter("DOD");
		
		System.out.println(name);
		System.out.println(region);
		System.out.println(noOfQueens);
		System.out.println(DOB);
		System.out.println(DOD);
		
		PrintWriter writer=resp.getWriter();
		writer.print("kingName"+name+"is sent success");
		writer.print("</span>");
		writer.print("</h1>");
		writer.print("</body>");
		writer.print("</html>");
		resp.setContentType("text/plain");
		
	}
	@Override
	public void destroy() {
		System.out.println("running destroy in KingServlet...");
		
	}
	
	
	

}
