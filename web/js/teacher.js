function ajaxFunction() {
	var xmlHttp;
	try { // Firefox, Opera 8.0+, Safari
		xmlHttp = new XMLHttpRequest();
	} catch (e) {
		try {// Internet Explorer
			xmlHttp = new ActiveXObject("Msxml2.XMLHTTP");
		} catch (e) {
			try {
				xmlHttp = new ActiveXObject("Microsoft.XMLHTTP");
			} catch (e) {
			}
		}
	}
	return xmlHttp;
}

function fun(){
	document.getElementById("div01").style.display="none";
	document.getElementById("div02").style.display="none";
	document.getElementById("div03").style.display="none";
	document.getElementById("div04").style.display="none";
	document.getElementById("div05").style.display="none";
}

function showMessage(url){
	fun();
	var request = ajaxFunction();
	request.open("GET", url, true);
	request.onreadystatechange = function() {
		if (request.readyState == 4 && request.status == 200) {
			document.getElementById("div01").style.display="";
			var me = request.responseText;
			var json = JSON.parse(me);			
			document.getElementById("id").value = json.id;
			document.getElementById("name").value = json.name;
			document.getElementById("age").value = json.age;
			document.getElementById("sex").value = json.sex;
			document.getElementById("home").value = json.home;
			document.getElementById("hobby").value = json.hobby;
		}
	}
	request.send();
}
function alterMessage(url){
	var request = ajaxFunction();
	var age = document.getElementById("age").value;
	var home = document.getElementById("home").value;
	var hobby = document.getElementById("hobby").value;
	request.open("GET", url+"&age="+age+"&home="+home+"&hobby="+hobby, true);
	request.onreadystatechange = function() {
		if (request.readyState == 4 && request.status == 200) {
			var mess = request.responseText;
			alert(mess);
		}
	}
	request.send();
}
function showAddScore(){
	fun();
	document.getElementById("div02").style.display="";
}
function showUpdateScore(){
	fun();
	document.getElementById("div03").style.display="";
}
function showDeleteScore(){
	fun();
	document.getElementById("div04").style.display="";
}
function showAllScore(){
	fun();
	document.getElementById("div05").style.display="";
}
function addScore(url){
	var id = document.getElementById("stu_id").value;
	var score = document.getElementById("score").value;
	var class_id = document.getElementById("class_id").value;
	if(id==""){
		alert("请输入学生ID");
		return false;
	}
	if(score==""){
		alert("请输入学生分数");
		return false;
	}
	if(class_id==""){
		alert("请输入课程ID");
		return false;
	}
	var request = ajaxFunction();
	request.open("GET", url+"?stu_id="+id+"&score="+score+"&class_id="+class_id, true);
	request.onreadystatechange = function() {
		if (request.readyState == 4 && request.status == 200) {
			var mess = request.responseText;
			alert(mess);
		}
	}
	request.send();
}
function updateScore(url){
	var id = document.getElementById("stu_id2").value;
	var score = document.getElementById("score2").value;
	var class_id = document.getElementById("class_id2").value;
	if(id==""){
		alert("请输入学生ID");
		return false;
	}
	if(score==""){
		alert("请输入学生分数");
		return false;
	}
	if(class_id==""){
		alert("请输入课程ID");
		return false;
	}
	var request = ajaxFunction();
	request.open("GET", url+"?stu_id="+id+"&score="+score+"&class_id="+class_id, true);
	request.onreadystatechange = function() {
		if (request.readyState == 4 && request.status == 200) {
			var mess = request.responseText;
			alert(mess);
		}
	}
	request.send();
}
function deleteScore(url){
	var id = document.getElementById("stu_id3").value;
	var class_id = document.getElementById("class_id3").value;
	if(id==""){
		alert("请输入学生ID");
		return false;
	}
	if(class_id==""){
		alert("请输入课程ID");
		return false;
	}
	var request = ajaxFunction();
	request.open("GET", url+"?stu_id="+id+"&class_id="+class_id, true);
	request.onreadystatechange = function() {
		if (request.readyState == 4 && request.status == 200) {
			var mess = request.responseText;
			alert(mess);
		}
	}
	request.send();
}
function getAllScore(url){
	var class_id = document.getElementById("class_id4").value;
	if(class_id==""){
		alert("请输入课程ID");
		return false;
	}
	var request = ajaxFunction();
	request.open("GET", url+"?class_id="+class_id, true);
	request.onreadystatechange = function() {
		if (request.readyState == 4 && request.status == 200) {
			var mess = request.responseText;
			alert(mess);
		}
	}
	request.send();
}