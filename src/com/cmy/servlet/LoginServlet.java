package com.cmy.servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cmy.service.UserService;
import com.cmy.serviceimpl.UserServiceImpl;

/**
 * 这是用于处理登陆信息的servlet
 * @author Li
 *
 */
public class LoginServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String type = request.getParameter("type");
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		UserService service = new UserServiceImpl();
		try {
			boolean flag = service.login(username,password,type);
			if(flag==true){
				Cookie cookie = new Cookie("user_id", username);
				response.addCookie(cookie);
				switch(type){
				case "student":
					Cookie cookie01  = new Cookie("type", "student");
					response.addCookie(cookie01);
					response.sendRedirect("student.jsp"); break;
				case "teacher":
					Cookie cookie02  = new Cookie("type", "teacher");
					response.addCookie(cookie02);
					response.sendRedirect("teacher.jsp"); break;
				case "root":
					Cookie cookie03  = new Cookie("type", "root");
					response.addCookie(cookie03);
					response.sendRedirect("root.jsp"); break;
				default:break;
				}
			}
			else{
				request.setAttribute("login_message", "用户名或密码错误!");
				request.getRequestDispatcher("index.jsp").forward(request, response);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
