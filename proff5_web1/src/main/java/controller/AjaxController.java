package controller;


import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONObject;

@WebServlet("/ajax")
public class AjaxController extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("ajax!");
//		System.out.println("req.getParameter="+req.getParameter("text1"));
	//	System.out.println("req.getAttribute="+req.getAttribute("text1"));
		
		String str = req.getParameter("text1");
		//System.out.println("obj="+obj);
		System.out.println("str="+str);
		
		JSONObject myJsonObj = new JSONObject();
		//StringBuilder sb = new StringBuilder();
		
		// List<Product> products = UserServiceImpl.getAllProduct(); 
		
		myJsonObj.append("result", str+"<span style='font-size:24px'>big</span><span style='font-size:18px'>little</span>");
		
		resp.setContentType("application/json");
		resp.setCharacterEncoding("UTF-8");
		resp.getWriter().write(myJsonObj.toString());		
	}
}

