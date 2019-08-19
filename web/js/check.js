function checkForm(){
	var username = document.getElementById("username").value;
	var password = document.getElementById("password").value;
	var span01 = document.getElementById("span01");
	if(username==null || username==""){
		span01.innerHTML = "<font color='red'>用户名不能为空!</font><br /><br />";
		span02.innerHTML = "";
		return false;
	}
	else if(password==null || password==""){
		span01.innerHTML = "<font color='red'>密码不能为空!</font><br /><br />"
		span02.innerHTML = "";
		return false;
	}
	else{
		span01.innerHTML = "";
		return true;
	}
}