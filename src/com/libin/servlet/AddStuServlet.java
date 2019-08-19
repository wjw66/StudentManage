package com.libin.servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.libin.service.RootService;
import com.libin.serviceimpl.RootServiceImpl;

/**
 * 这是用于处理录入新生信息的servlet
 * @author Li
 *
 */
public class AddStuServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String stu_id = request.getParameter("stu_id");
		String name = request.getParameter("name");
		String class_id = request.getParameter("class_id");
		String dorm = request.getParameter("dorm");
		RootService service = new RootServiceImpl();
		try {
			String mess = service.addStu(stu_id, name, class_id, dorm);
			response.getWriter().write(mess);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			response.getWriter().write("添加失败!");
			e.printStackTrace();
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
