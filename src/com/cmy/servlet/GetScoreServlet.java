package com.cmy.servlet;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cmy.bean.ScoreBean;
import com.cmy.service.StudentService;
import com.cmy.serviceimpl.StudentServiceImpl;

import net.sf.json.JSONArray;

/**
 * 这是用于处理查询学生成绩的Servlet
 * @author Li
 *
 */
public class GetScoreServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String user_id = request.getParameter("user_id");
		String score_name = request.getParameter("score_name");
		StudentService service = new StudentServiceImpl();
		try {
			List<ScoreBean> list = service.getGrade(user_id, score_name);
			JSONArray json = JSONArray.fromObject(list);
			String s = json.toString();
			response.getWriter().write(s);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			response.getWriter().write("查询失败!");
			e.printStackTrace();
		}
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
