<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>cookieDemo1</title>
</head>
<body>
<%
Cookie c1 = new Cookie("name","tianmai");
Cookie c2 = new Cookie("age","26");
//设置cookie超时时间为5秒
c1.setMaxAge(5);
c2.setMaxAge(5);
response.addCookie(c1);
response.addCookie(c2);
%>

<a href="cookieDemo2.jsp">超链接</a>
<!-- 运行Demo1 5s内点击超链接，则，能看到Demo2获取到1给2的cookie的值，
5s之后在点超链接，则，因为cookie时间超时看不到 -->
</body>
</html>