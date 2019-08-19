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
	document.getElementById("div01").style.display = "none";
	document.getElementById("div02").style.display = "none";
	document.getElementById("div03").style.display = "none";
	document.getElementById("div04").style.display = "none";
	document.getElementById("div05").style.display = "none";
	document.getElementById("div06").style.display = "none";
}
function showAddStu(){
	fun();
	document.getElementById("div01").style.display = "";
}
function showAddTea(){
	fun();
	document.getElementById("div02").style.display = "";
}
function showAddClass(){
	fun();
	document.getElementById("div03").style.display = "";
}
function showDelStu(){
	fun();
	document.getElementById("div04").style.display = "";
}
function showDelTea(){
	fun();
	document.getElementById("div05").style.display = "";
}
function showAddClassTab(){
	fun();
	document.getElementById("div06").style.display = "";
}
function addStu(url){
	var stu_id = document.getElementById("stu_id").value;
	var name = document.getElementById("name").value;
	var class_id = document.getElementById("class_id").value;
	var dorm = document.getElementById("dorm").value;
	if(stu_id=="" || name=="" || class_id=="" || dorm==""){
		alert("请输入完整信息!")
		return false;
	}
	var request = ajaxFunction();
	request.open("GET", url+"?stu_id="+stu_id+"&name="+name+"&class_id="+class_id+"&dorm="+dorm, true);
	request.onreadystatechange = function(){
		if(request.readyState == 4 && request.status == 200){
			var mess = request.responseText;
			alert(mess);
		}
	}
	request.send();
}
function addTea(url){
	var tea_id = document.getElementById("tea_id").value;
	var name = document.getElementById("tea_name").value;
	if(tea_id=="" || name==""){
		alert("请输入完整信息!")
		return false;
	}
	var request = ajaxFunction();
	request.open("GET", url+"?tea_id="+tea_id+"&name="+name, true);
	request.onreadystatechange = function(){
		if(request.readyState == 4 && request.status == 200){
			var mess = request.responseText;
			alert(mess);
		}
	}
	request.send();
}
function delStu(url){
	var stu_id = document.getElementById("stu_id2").value;
	if(stu_id==""){
		alert("请输入学号");
		return false;
	}
	var request = ajaxFunction();
	request.open("GET", url+"?stu_id="+stu_id, true);
	request.onreadystatechange = function(){
		if(request.readyState==4 && request.status==200){
			var mess = request.responseText;
			alert(mess);
		}
	}
	request.send();
}
function delTea(url){
	var tea_id = document.getElementById("tea_id2").value;
	if(tea_id==""){
		alert("请输入工号");
		return false;
	}
	var request = ajaxFunction();
	request.open("GET", url+"?tea_id="+tea_id, true);
	request.onreadystatechange = function(){
		if(request.readyState==4 && request.status==200){
			var mess = request.responseText;
			alert(mess);
		}
	}
	request.send();
}
function addClass(url){
	var score_id = document.getElementById("score_id").value;
	var score_name = document.getElementById("score_name").value;
	var tea_id = document.getElementById("tea_id3").value;
	if(score_id=="" || score_name=="" || tea_id==""){
		alert("请输入完整信息!");
		return false;
	}
	var request = ajaxFunction();
	request.open("GET", url+"?score_id="+score_id+"&score_name="+score_name+"&tea_id="+tea_id, true);
	request.onreadystatechange = function(){
		if(request.readyState==4 && request.status==200){
			var mess = request.responseText;
			alert(mess);
		}
	}
	request.send();
}
function addClassTab(url){
	var score_id = document.getElementById("score_id2").value;
	var class_id = document.getElementById("class_id2").value;
	var score_time = document.getElementById("score_time").value;
	if(score_id=="" || class_id=="" || score_time==""){
		alert("请输入完整信息!")
		return false;
	}
	var request = ajaxFunction();
	request.open("GET", url+"?score_id="+score_id+"&class_id="+class_id+"&score_time="+score_time, true);
	request.onreadystatechange = function(){
		if(request.readyState==4 && request.status==200){
			var mess = request.responseText;
			alert(mess);
		}
	}
	request.send();
}