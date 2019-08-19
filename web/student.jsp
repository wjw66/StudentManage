<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script type="text/javascript" src="js/student.js"></script>
<link type="text/css" rel="stylesheet" href="css/css.css" />
<title>Insert title here</title>
</head>
<body>	
	<table style="width: 100%;height: 700px;text-align: center;border:1px solid antiquewhite;">
		<tr style="width:100%;height:35px;background-color: antiquewhite;">
			<td colspan="2" >学生信息管理系统(学生版)</td>
		</tr>
		<tr>
			<td style="width: 200px;background-color: antiquewhite;">
				<c:if test="${cookie.user_id!=null }">
					<a onclick="showMessage('LookMessServlet?user_id=${cookie.user_id.value}')" href="#">查看个人信息</a>
				</c:if>
			</td>
			<td rowspan="4">
				<div id="div01" style="display: none;">
					学&nbsp;&nbsp;号&nbsp;<input type="text" id="id" disabled><br><br>
					姓&nbsp;&nbsp;名&nbsp;<input type="text" id="name" disabled><br><br>
					班&nbsp;&nbsp;号&nbsp;<input type="text" id="class_id" disabled><br><br>
					宿&nbsp;&nbsp;舍&nbsp;<input type="text" id="dorm" disabled><br><br>
					年&nbsp;&nbsp;龄&nbsp;<input type="text" id="age" disabled><br><br>
					性&nbsp;&nbsp;别&nbsp;<input type="text" id="sex" disabled><br><br>
					住&nbsp;&nbsp;址&nbsp;<input type="text" id="home" disabled><br><br>
					爱&nbsp;&nbsp;好&nbsp;<textarea rows="2" cols="17" id="hobby" disabled></textarea><br><br>
				</div>
				<div id="div02" style="display: none;">
					学&nbsp;&nbsp;号&nbsp;<input type="text" id="id2" disabled><br><br>
					姓&nbsp;&nbsp;名&nbsp;<input type="text" id="name2" disabled><br><br>
					班&nbsp;&nbsp;号&nbsp;<input type="text" id="class_id2" disabled><br><br>
					宿&nbsp;&nbsp;舍&nbsp;<input type="text" id="dorm2" disabled><br><br>
					年&nbsp;&nbsp;龄&nbsp;<input type="text" id="age2"><br><br>
					性&nbsp;&nbsp;别&nbsp;<input type="text" id="sex2" disabled><br><br>
					住&nbsp;&nbsp;址&nbsp;<input type="text" id="home2" ><br><br>
					爱&nbsp;&nbsp;好&nbsp;<textarea rows="2" cols="17" id="hobby2"></textarea><br><br>
					<button onclick="alterMessage('AlterStuMessServlet?user_id=${cookie.user_id.value}')">修改</button>
				</div>
				<div id="div03" style="display: none;text-align:center;">
					<table style="border: 1px solid;text-align: center;margin-left: 300px;">
						<tr style="height: 50px;">
							<td></td>
							<td>星期一</td>
							<td>星期二</td>
							<td>星期三</td>
							<td>星期四</td>
							<td>星期五</td>
							<td>星期六</td>
							<td>星期天</td>
						</tr>
						<tr style="height: 50px;">
							<td>课程</td>
							<td id="tab1"></td>
							<td id="tab2"></td>
							<td id="tab3"></td>
							<td id="tab4"></td>
							<td id="tab5"></td>
							<td id="tab6"></td>
							<td id="tab7"></td>
						</tr>
					</table>
				</div>
				<div id="div04" style="display: none;">
					<input type="text" placeholder="请输入课程名" id="score">&nbsp;
					<button onclick="getScore('GetScoreServlet?user_id=${cookie.user_id.value}')" >查询</button>
				</div>
				<div id="div05" style="display: none;">
					<span id="span01"></span><br>
					<span id="span02"></span><br>
					<span id="span03"></span><br>
					<span id="span04"></span><br>
					<span id="span05"></span><br>
					<span id="span06"></span><br>
					<span id="span07"></span><br>
					<span id="span08"></span><br>
					<span id="span09"></span><br>
				</div>
			</td>
		</tr>
		<tr>
			<td style="width: 200px;background-color: antiquewhite;">
				<c:if test="${cookie.user_id!=null }">
					<a onclick="showMessage2('LookMessServlet?user_id=${cookie.user_id.value}')" href="#">修改个人信息</a>
				</c:if>
			</td>
		</tr>
		<tr>
			<td style="width: 200px;background-color: antiquewhite;">
				<c:if test="${cookie.user_id!=null }">
					<a onclick="showClassTable('LookStuClassTabServlet?user_id=${cookie.user_id.value}')" href="#">查看课程表</a>
				</c:if>
			</td>
		</tr>
		<tr>
			<td style="width: 200px;background-color: antiquewhite;">
				<c:if test="${cookie.user_id!=null }">
					<a onclick="showScore()" href="#">查询考试成绩</a>
				</c:if>
			</td>
		</tr>
	</table>
</body>
</html>