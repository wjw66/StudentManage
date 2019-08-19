<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script type="text/javascript" src="js/root.js"></script>
<link type="text/css" rel="stylesheet" href="css/css.css" />
<title>Insert title here</title>
</head>
<body>
	<table style="width: 100%;height: 700px;text-align: center;border:1px solid antiquewhite;">
		<tr style="width:100%;height:35px;background-color: antiquewhite;">
			<td colspan="2" >学生信息管理系统(管理员版)</td>
		</tr>
		<tr>
			<td style="width: 200px;background-color: antiquewhite;">
				<c:if test="${cookie.user_id!=null }">
					<a onclick="showAddStu()" href="#">录入新生信息</a>
				</c:if>
			</td>
			<td rowspan="6">
				<div id="div01" style="display: none;">
					学&nbsp;&nbsp;号&nbsp;<input type="text" id="stu_id"><br><br>
					姓&nbsp;&nbsp;名&nbsp;<input type="text" id="name"><br><br>
					班&nbsp;&nbsp;号&nbsp;<input type="text" id="class_id" ><br><br>
					宿&nbsp;&nbsp;舍&nbsp;<input type="text" id="dorm"><br><br>
					<button onclick="addStu('AddStuServlet')">录入</button>
				</div>
				<div id="div02" style="display: none;">
					工&nbsp;&nbsp;号&nbsp;<input type="text" id="tea_id"><br><br>
					姓&nbsp;&nbsp;名&nbsp;<input type="text" id="tea_name"><br><br>
					<button onclick="addTea('AddTeaServlet')">录入</button>
				</div>
				<div id="div03" style="display: none;text-align:center;">
					课程号&nbsp;<input type="text" id="score_id"><br><br>
					课程名&nbsp;<input type="text" id="score_name"><br><br>
					教师号&nbsp;<input type="text" id="tea_id3"><br><br>
					<button onclick="addClass('AddClassServlet')">添加</button>
				</div>
				<div id="div04" style="display: none;">
					<input type="text" id="stu_id2" placeholder="请输入学号"><br>
					<button onclick="delStu('DelStuServlet')">删除</button>
				</div>
				<div id="div05" style="display: none;">
					<input type="text" id="tea_id2" placeholder="请输入工号"><br>
					<button onclick="delTea('DelTeaServlet')">删除</button>
				</div>
				<div id="div06" style="display: none;text-align:center;">
					课程ID&nbsp;<input type="text" id="score_id2"><br><br>
					班级ID&nbsp;<input type="text" id="class_id2"><br><br>
					时&nbsp;&nbsp;&nbsp;间&nbsp;
					<select id="score_time" style="height: 30px; width: 188px">
						<option value="星期一">星期一</option>
						<option value="星期二">星期二</option>
						<option value="星期三">星期三</option>
						<option value="星期四">星期四</option>
						<option value="星期五">星期五</option>
						<option value="星期六">星期六</option>
						<option value="星期日">星期日</option>
					</select>
					<br><br>
					<button onclick="addClassTab('AddClassTabServlet')">添加</button>
				</div>
			</td>
		</tr>
		<tr>
			<td style="width: 200px;background-color: antiquewhite;">
				<c:if test="${cookie.user_id!=null }">
					<a onclick="showAddTea()" href="#">录入教师信息</a>
				</c:if>
			</td>
		</tr>
		<tr>
			<td style="width: 200px;background-color: antiquewhite;">
				<c:if test="${cookie.user_id!=null }">
					<a onclick="showAddClass()" href="#">录入新课程</a>
				</c:if>
			</td>
		</tr>
		<tr>
			<td style="width: 200px;background-color: antiquewhite;">
				<c:if test="${cookie.user_id!=null }">
					<a onclick="showAddClassTab()" href="#">录入课表信息</a>
				</c:if>
			</td>
		</tr>
		<tr>
			<td style="width: 200px;background-color: antiquewhite;">
				<c:if test="${cookie.user_id!=null }">
					<a onclick="showDelStu()" href="#">删除学生信息</a>
				</c:if>
			</td>
		</tr>
		<tr>
			<td style="width: 200px;background-color: antiquewhite;">
				<c:if test="${cookie.user_id!=null }">
					<a onclick="showDelTea()" href="#">删除教师信息</a>
				</c:if>
			</td>
		</tr>
	</table>
</body>
</html>