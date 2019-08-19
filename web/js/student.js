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
			document.getElementById("class_id").value = json.class_id;
			document.getElementById("age").value = json.age;
			document.getElementById("sex").value = json.sex;
			document.getElementById("dorm").value = json.dorm;
			document.getElementById("home").value = json.home;
			document.getElementById("hobby").value = json.hobby;
		}
	}
	request.send();
}
function showMessage2(url){
	fun();
	var request = ajaxFunction();
	request.open("GET", url, true);
	request.onreadystatechange = function() {
		if (request.readyState == 4 && request.status == 200) {
			document.getElementById("div02").style.display="";
			var me = request.responseText;
			var json = JSON.parse(me);			
			document.getElementById("id2").value = json.id;
			document.getElementById("name2").value = json.name;
			document.getElementById("class_id2").value = json.class_id;
			document.getElementById("age2").value = json.age;
			document.getElementById("sex2").value = json.sex;
			document.getElementById("dorm2").value = json.dorm;
			document.getElementById("home2").value = json.home;
			document.getElementById("hobby2").value = json.hobby;
		}
	}
	request.send();
}
function alterMessage(url){
	var request = ajaxFunction();
	var age = document.getElementById("age2").value;
	var home = document.getElementById("home2").value;
	var hobby = document.getElementById("hobby2").value;
	request.open("GET", url+"&age="+age+"&home="+home+"&hobby="+hobby, true);
	request.onreadystatechange = function() {
		if (request.readyState == 4 && request.status == 200) {
			var mess = request.responseText;
			alert(mess);
		}
	}
	request.send();
}
function showScore(){
	fun();
	document.getElementById("div04").style.display="";
	document.getElementById("score").value = "";
}
function getScore(url){
	var request = ajaxFunction();
	var score = document.getElementById("score").value;
	request.open("GET", url+"&score_name="+score, true);
	request.onreadystatechange = function() {
		if (request.readyState == 4 && request.status == 200) {
			document.getElementById("div05").style.display="";
			var s = request.responseText;
			var len = 0;
			var json = JSON.parse(s);
			var len = json.length;
			for(var i = 1; i < 10;i++){
				var spa = "span0"+i.toString();
				document.getElementById(spa).innerHTML = "";
			}
			for(var i = 0; i < len; i++){
				var spa = "span0"+(i+1).toString();
				document.getElementById(spa).innerHTML = json[i].name+":"+json[i].grade;
			}
		}
	}
	request.send();
}
function showClassTable(url){
	fun();
	var request = ajaxFunction();
	request.open("GET", url, true);
	request.onreadystatechange = function() {
		if (request.readyState == 4 && request.status == 200) {
			document.getElementById("div03").style.display="";
			var s = request.responseText;
			var json = JSON.parse(s);
			var len = json.length;
			for(var i = 1; i < 8;i++){
				var spa = "tab"+i.toString();
				document.getElementById(spa).innerHTML = "";
			}
			for(var i = 0; i < len; i++){
				switch(json[i].course_time){
				case "星期一":document.getElementById("tab1").innerHTML = json[i].score_name;break;
				case "星期二":document.getElementById("tab2").innerHTML = json[i].score_name;break;
				case "星期三":document.getElementById("tab3").innerHTML = json[i].score_name;break;
				case "星期四":document.getElementById("tab4").innerHTML = json[i].score_name;break;
				case "星期五":document.getElementById("tab5").innerHTML = json[i].score_name;break;
				case "星期六":document.getElementById("tab6").innerHTML = json[i].score_name;break;
				case "星期日":document.getElementById("tab7").innerHTML = json[i].score_name;break;
				default:document.getElementById(spa).innerHTML = "";break;
				}
			}
		}
	}
	request.send();
}