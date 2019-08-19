package com.libin.servlet;

import com.libin.service.RootService;
import com.libin.serviceimpl.RootServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

/**
 * 这是用于处理添加课表的servlet
 * @author Li
 *
 */
public class AddClassTabServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String score_id = request.getParameter("score_id");
		String class_id = request.getParameter("class_id");
		String score_time = request.getParameter("score_time");
		RootService service = new RootServiceImpl();
		try {
			String mess = service.addClassTab(score_id, class_id, score_time);
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
