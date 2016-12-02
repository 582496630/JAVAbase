<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<center>
<form name="loginForm" action="loginForward.jsp" method="post">
<p>用户名：<input name="userName" type="text" size="32" title="请输入用户名">
</p>

<p>密&nbsp;码：<input name="passWord" type="password" size="32" title="请输入密码">
</p>
<input name="submit" type="submit" value="登陆"><span>&nbsp;&nbsp;</span>
<input name="reset" type="reset" value="RESET">


</form>

</center>

</body>
</html>