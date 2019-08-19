package com.cmy.servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cmy.service.RootService;
import com.cmy.serviceimpl.RootServiceImpl;

/**
 * 这是用于处理添加教师信息的servlet
 * @author Li
 *
 */
public class AddTeaServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String tea_id = request.getParameter("tea_id");
		String name = request.getParameter("name");
		RootService service = new RootServiceImpl();
		try {
			String mess = service.addTea(tea_id, name);
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
