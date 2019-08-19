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
 * 这是处理用于增加新课程的servlet
 * @author Li
 *
 */
public class AddClassServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String score_id = request.getParameter("score_id");
		String score_name = request.getParameter("score_name");
		String tea_id = request.getParameter("tea_id");
		RootService service = new RootServiceImpl();
		try {
			String mess = service.addClass(score_id, score_name, tea_id);
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
