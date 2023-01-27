package com.xworkz.series.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 1,urlPatterns = "/series")

public class webSeriesServlet extends HttpServlet {
	
	public webSeriesServlet() {
		System.out.println("runnimg no-args constr in webSeriesServlet.........");
	}
	@Override
	public void init() throws ServletException {
		System.out.println("running init in no-args constr......");
	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("running doget in webSeriesServlet........."); 
		System.out.println(Thread.currentThread().getName());
		String name=req.getParameter("webSeriesName");
		String language=req.getParameter("language");
		String episodes=req.getParameter("episodes");
		String ott=req.getParameter("ott");
		String budget =req.getParameter("budget");
		
		System.out.println(name);
		System.out.println(language);
		System.out.println(episodes);
		System.out.println(ott);
		System.out.println(budget);
		
		PrintWriter writer=resp.getWriter();
		writer.print("webSeriesName"+name+"is sent success");
		writer.print("</span>");
		writer.print("</h1>");
		writer.print("</body>");
		writer.print("</html>");
		resp.setContentType("text/plain");
		
	}
	@Override
	public void destroy() {
		System.out.println("running destroy in weSeriesServlet...");
		
	}
	
	

}
