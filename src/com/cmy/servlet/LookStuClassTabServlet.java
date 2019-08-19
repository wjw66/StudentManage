package com.cmy.servlet;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cmy.bean.ClassTableBean;
import com.cmy.service.StudentService;
import com.cmy.serviceimpl.StudentServiceImpl;
import net.sf.json.JSONArray;

/**
 * 这是用于显示学生课表的servlet
 * @author Li
 *
 */
public class LookStuClassTabServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("user_id");
		StudentService service = new StudentServiceImpl();
		try {
			List<ClassTableBean> list = service.getClassTable(id);
			JSONArray json = JSONArray.fromObject(list);
			String s = json.toString();
			response.getWriter().write(s);
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
