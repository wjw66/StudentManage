<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script type="text/javascript" src="js/teacher.js"></script>
<link type="text/css" rel="stylesheet" href="css/css.css" />
<title>Insert title here</title>
</head>
<body>
	<table style="width: 100%;height: 700px;text-align: center;border:1px solid antiquewhite;">
		<tr style="width:100%;height:35px;background-color: antiquewhite;">
			<td colspan="2" >学生信息管理系统(教师版)</td>
		</tr>
		<tr>
			<td style="width: 200px;background-color: antiquewhite;">
				<c:if test="${cookie.user_id!=null }">
					<a onclick="showMessage('LookMessServlet?user_id=${cookie.user_id.value}')" href="#">修改个人信息</a>
				</c:if>
			</td>
			<td rowspan="4">
				<div id="div01" style="display: none;">
					工&nbsp;&nbsp;号&nbsp;<input type="text" id="id" disabled><br><br>
					姓&nbsp;&nbsp;名&nbsp;<input type="text" id="name" disabled><br><br>
					年&nbsp;&nbsp;龄&nbsp;<input type="text" id="age" ><br><br>
					性&nbsp;&nbsp;别&nbsp;<input type="text" id="sex" disabled><br><br>
					住&nbsp;&nbsp;址&nbsp;<input type="text" id="home" ><br><br>
					爱&nbsp;&nbsp;好&nbsp;<textarea rows="2" cols="17" id="hobby"></textarea><br><br>
					<button onclick="alterMessage('AlterTeaMessServlet?user_id=${cookie.user_id.value}')">修改</button>
				</div>
				<div id="div02" style="display: none;">
					<input type="text" placeholder="请输入课程ID" id="class_id">&nbsp;
					<input type="text" placeholder="请输入学号" id="stu_id">&nbsp;
					<input type="text" placeholder="请输入成绩" id="score">&nbsp;
					<button onclick="addScore('AddScoreServlet')">录入</button>
				</div>
				<div id="div03" style="display: none;text-align:center;">
					<input type="text" placeholder="请输入课程ID" id="class_id2">&nbsp;
					<input type="text" placeholder="请输入学号" id="stu_id2">&nbsp;
					<input type="text" placeholder="请输入成绩" id="score2">&nbsp;
					<button onclick="updateScore('UpdateScoreServlet')">更新</button>
				</div>
				<div id="div04" style="display: none;">
					<input type="text" placeholder="请输入课程ID" id="class_id3">&nbsp;
					<input type="text" placeholder="请输入学号" id="stu_id3">&nbsp;
					<button onclick="deleteScore('DeleteScoreServlet')">删除</button>
				</div>
				<div id="div05" style="display: none;">
					<input type="text" placeholder="请输入课程ID" id="class_id4">&nbsp;
					<button onclick="getAllScore('GetAllScoreServlet')">查询</button>
				</div>
			</td>
		</tr>
		<tr>
			<td style="width: 200px;background-color: antiquewhite;">
				<c:if test="${cookie.user_id!=null }">
					<a onclick="showAddScore()" href="#">录入考试成绩</a>
				</c:if>
			</td>
		</tr>
		<tr>
			<td style="width: 200px;background-color: antiquewhite;">
				<c:if test="${cookie.user_id!=null }">
					<a onclick="showUpdateScore()" href="#">修改考试成绩</a>
				</c:if>
			</td>
		</tr>
		<tr>
			<td style="width: 200px;background-color: antiquewhite;">
				<c:if test="${cookie.user_id!=null }">
					<a onclick="showDeleteScore()" href="#">删除考试成绩</a>
				</c:if>
			</td>
		</tr>
	</table>
</body>
</html>