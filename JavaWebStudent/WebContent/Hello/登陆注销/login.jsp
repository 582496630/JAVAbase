<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="login.jsp" method="post">
		<center>
			用户名:<input type="text" name="uname" /><br /> 密&nbsp;码:<input
				type="password" name="upass" /><br /> <input type="submit"
				value="登陆"> <input type="reset" value="重置">
		</center>
	</form>
	<%
		//用户名：天霾    密码：1234
		String name = request.getParameter("uname");
		String pwd = request.getParameter("upass");
		/* 		if (!(name == null || "".equals(name) || pwd == null || "".equals(pwd))) {
					if ("tianmai".equals(name) && "1234".equals(pwd)) { */

		if (null != name && null != pwd && "tianmai".equals(name) && "1234".equals(pwd)) {
			response.setHeader("refresh", "2;url=loginOK.jsp");//定时跳转
			session.setAttribute("userid", name);//将用户名保存在session中
	%>

	<p>用户登陆成功，两秒后跳转到欢迎页</p>
	<p>
		如果没有跳转请点击<a href="loginOK.jsp">这里</a>
	</p>
	<%
		} else {
	%>
	<h3>错误的用户名与密码</h3>
	<%
		}
	%>


</body>
</html>