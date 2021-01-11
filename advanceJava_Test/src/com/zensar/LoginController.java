package com.zensar;

import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class LoginController extends HttpServlet {
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) {
		String requestAction = request.getParameter("requestAction");
		if(requestAction.equalsIgnoreCase("login")){
		String userName=request.getParameter("userName");
		String password=request.getParameter("password");
		
		LoginRepository repository=new LoginRepository();
		boolean loginResult = repository.checkLogin(userName, password);
		if(loginResult) {
			System.out.println("Login Successfull");
			try {
				response.sendRedirect("test.jsp");
			}catch(Exception e) {
				System.out.println("Exception Occured: "+e);
			}
		}else {
			System.out.println("Login Failed");

			try {
				response.sendRedirect("login.jsp?loginStatus=fail");
			} catch (IOException e) {
				System.out.println("Exception Occured: "+e);
			}
		}}
	}
		public void doPost(HttpServletRequest request, HttpServletResponse response) {
			doGet(request, response);
		}
}
