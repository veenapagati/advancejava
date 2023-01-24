package com.xworkz.sweetHome.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(loadOnStartup = 8,urlPatterns = "/petals")
public class FlowerServlet extends HttpServlet {
	public FlowerServlet() {
		System.out.println("running FlowerServlet in no-args constructor.........");
	}@Override
	protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("FlowerServlet...dodeletex....on web page.....");
		super.doDelete(req, resp);
	}
	@Override
	protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("FlowerServlet...doPut....on web page.....");
		super.doPut(req, resp);
	}
	@Override
	public void init() throws ServletException {
		System.out.println("running init.........");
		super.init();
	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("FlowerServlet...doGet....on web page.....");
		String data="rose!! pretty";
		PrintWriter writer=resp.getWriter();
		writer.print(data);
		resp.setContentType("text/plain");
		
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("post from flower...");
		String data="Car race,then !! Curd rice!!,egg rice,happy";
		PrintWriter writer=resp.getWriter();
		writer.print(data);
		resp.setContentType("text/plain");
	}
	@Override
	protected void doHead(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("FlowerServlet...doHead....on web page.....");
		super.doHead(req, resp);
	}
	@Override
	protected void doOptions(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("FlowerServlet...doOptions....on web page.....");
		super.doOptions(req, resp);
	}
	@Override
	protected void doTrace(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("FlowerServlet..doTrace....on web page.....");
		super.doTrace(req, resp);
	}

}
