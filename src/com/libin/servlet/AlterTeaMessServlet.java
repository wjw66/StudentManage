package com.libin.servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.libin.service.TeacherService;
import com.libin.serviceimpl.TeacherServiceImpl;

/**
 * 这是用于处理修改教师信息的servlet
 * @author Li
 *
 */
public class AlterTeaMessServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("user_id");
		int age = Integer.parseInt(request.getParameter("age"));
		String home  = request.getParameter("home");
		String hobby = request.getParameter("hobby");
		TeacherService service = new TeacherServiceImpl();
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
