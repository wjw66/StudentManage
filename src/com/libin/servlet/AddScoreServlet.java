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
 * 这是用于处理录入学生成绩servlet
 * @author Li
 *
 */
public class AddScoreServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String stu_id = request.getParameter("stu_id");
		Float score = Float.parseFloat(request.getParameter("score"));
		String class_id = request.getParameter("class_id");
		TeacherService service = new TeacherServiceImpl();
		try {
			String mess = service.addScore(stu_id, class_id, score);
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
