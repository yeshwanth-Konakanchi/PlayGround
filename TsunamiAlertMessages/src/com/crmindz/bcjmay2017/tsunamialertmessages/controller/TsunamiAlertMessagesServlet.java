package com.crmindz.bcjmay2017.tsunamialertmessages.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.crmindz.bcjmay2017.tsunamialertmessages.service.TsunamiAlertService;

/**
 * Servlet implementation class TsunamiAlertMessagesServlet
 */
@WebServlet("/TsunamiAlertMessagesServlet")
public class TsunamiAlertMessagesServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String country = request.getParameter("country");
		Map<String,String> map= TsunamiAlertService.processTsunamiData(country);
		for (Map.Entry<String, String> entry : map.entrySet())
		{
			out.println("<html><body>");
			out.println("<div align=" + "center" + ">");
			out.println("<h1>");
			out.println("Alert Messages");
			out.println(entry.getKey());
			out.println(" ---");
			out.println(entry.getValue());
			out.println("<br>");
			out.println("</h1>");
			out.println("</div>");
			out.println("</body><html>");
		
		}
		
	}

}
