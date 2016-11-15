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
import javax.servlet.http.HttpSession;

@WebServlet("/form")
public class FormsController extends HttpServlet{
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		String par = (String) request.getParameter("par");
		System.out.println("get:"+par);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("/jsp/forms.jsp");
		dispatcher.forward(request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		String par = (String) request.getParameter("par");
		System.out.println("post:"+par);
		
		if("qwerty".equals(par)){
			HttpSession session = request.getSession();
			session.setAttribute("atr", new Object());
			response.sendRedirect("http://localhost:8080/proff5_web2/first");
		}
		else if("qwerty1".equals(par)) response.sendRedirect("/proff5_web2/other1");
		else {
			RequestDispatcher dispatcher = request.getRequestDispatcher("/jsp/forms.jsp");
			dispatcher.forward(request, response);
		}
	}
	
}
