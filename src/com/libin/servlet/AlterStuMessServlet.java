package com.libin.servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.libin.service.StudentService;
import com.libin.serviceimpl.StudentServiceImpl;


/**
 * 这是用于处理修改学生信息的servlet
 * @author Li
 *
 */
public class AlterStuMessServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("user_id");
		int age = Integer.parseInt(request.getParameter("age"));
		String home  = request.getParameter("home");
		String hobby = request.getParameter("hobby");
		StudentService service = new StudentServiceImpl();
		try {
			boolean flag = service.alterMessage(id, age, home, hobby);
			if(flag==false){
				response.getWriter().write("数据库异常，请稍后再试!");
			}
			else{
				response.getWriter().write("修改成功!");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			response.getWriter().write("修改失败!");
			e.printStackTrace();
		}
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
