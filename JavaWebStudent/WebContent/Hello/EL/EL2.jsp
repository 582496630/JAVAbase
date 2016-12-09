<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!--     禁用EL表达式 -->
    <%@page isELIgnored="true" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<%
//pageContext.setAttribute("color", "lightblue");
// request.setAttribute("color", "lightgreen");
session.setAttribute("color", "orange");
//application.setAttribute("color", "lavender");
%>

<body bgcolor="${color}">
<p>********************************</p>



</body>
</html>