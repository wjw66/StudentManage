package com.cmy.servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cmy.bean.StudentBean;
import com.cmy.bean.TeacherBean;
import com.cmy.service.StudentService;
import com.cmy.service.TeacherService;
import com.cmy.serviceimpl.StudentServiceImpl;
import com.cmy.serviceimpl.TeacherServiceImpl;

import net.sf.json.JSONObject;

/**
 * 这是用于处理查询用户信息的servlet
 * @author Li
 *
 */
public class LookMessServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String type = null;
		Cookie [] cook = request.getCookies();
		for (Cookie cookie : cook) {
			String name = cookie.getName();
			if(name.equals("type")){
				type = cookie.getValue();
			}
		}
		String user_id = request.getParameter("user_id");
		try{
			if(user_id!=null && user_id!=""){
				if(type.equals("student")){
					StudentService service = new StudentServiceImpl();
					StudentBean stu = service.getMessage(user_id);
					JSONObject json = JSONObject.fromObject(stu);
					String s = json.toString();
					response.getWriter().write(s);
				}
				else if(type.equals("teacher")){
					TeacherService service = new TeacherServiceImpl();
					TeacherBean stu = service.getMessage(user_id);
					JSONObject json = JSONObject.fromObject(stu);
					String s = json.toString();
					response.getWriter().write(s);
				}
			}
		}catch(SQLException ex){
			response.getWriter().write("查询失败!");
			ex.printStackTrace();
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
