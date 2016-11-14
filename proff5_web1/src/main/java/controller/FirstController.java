package controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/first")
public class FirstController extends HttpServlet{
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		RequestDispatcher dispatcher = 
				request.getRequestDispatcher("/jsp/first.jsp");
		dispatcher.forward(request, response);
	}
	List<String> list = new ArrayList();
			
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String str = request.getParameter("polk");
		list.add(str);
		
		request.setAttribute("nabor", list);
		
		
		RequestDispatcher dispatcher = 
				request.getRequestDispatcher("/jsp/first.jsp");
		dispatcher.forward(request, response);
	}
}
