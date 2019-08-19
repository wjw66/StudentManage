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
 * 这是用于处理删除学生的servlet
 * @author Li
 *
 */
public class DelStuServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String stu_id = request.getParameter("stu_id");
		RootService service = new RootServiceImpl();
		try {
			String mess = service.delStu(stu_id);
			response.getWriter().write(mess);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			response.getWriter().write("删除失败!");
			e.printStackTrace();
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
