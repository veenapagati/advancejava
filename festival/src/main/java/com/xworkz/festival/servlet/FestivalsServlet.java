package com.xworkz.festival.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(loadOnStartup = 1,urlPatterns = "/festivals")
public class FestivalsServlet extends HttpServlet {
	
	public FestivalsServlet() {
		System.out.println("running FestivalsServlet in no-args constructor.......");
	}
	@Override
	public void init() throws ServletException {
		System.out.println("running init in no-args constr......");
	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("running doget in FestivalsServlet........."); 
		System.out.println(Thread.currentThread().getName());
		String name=req.getParameter("festivalName");
		String region=req.getParameter("region");
		String noOfDays=req.getParameter("noOfDays");
		String mainReason=req.getParameter("mainReason");
		String god=req.getParameter("god");
		String members=req.getParameter("members");
		String dress=req.getParameter("dress");
		String drama=req.getParameter("drama");
		String games=req.getParameter("games");
		String scientificReason=req.getParameter("scientificReason");
		String official=req.getParameter("official");
		String location=req.getParameter("location");
		String budget=req.getParameter("budget");
		String leave=req.getParameter("leave");
		String foodType=req.getParameter("foodType");
		String specialFlower=req.getParameter("flower");
		String fruit=req.getParameter("fruit");
		String security=req.getParameter("security");
		String winningPrize=req.getParameter("winningPrize");
		String decoration=req.getParameter("decoration");
		String promotion=req.getParameter("promotion");
		
		
		
		System.out.println(name);
		System.out.println(region);
		System.out.println(noOfDays);
		System.out.println(mainReason);
		System.out.println(members);
		System.out.println(dress);
		System.out.println(drama);
		System.out.println(games);
		System.out.println( scientificReason);
		System.out.println(official);
		System.out.println(location);
		System.out.println(budget);
		System.out.println(leave);
		System.out.println(foodType);
		System.out.println(specialFlower);
		System.out.println(fruit);
		System.out.println(security);
		System.out.println(winningPrize);
		System.out.println(decoration);
		System.out.println(promotion);
		
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
		System.out.println("running destroy in FestivalsServlet...");
		
	}

}
