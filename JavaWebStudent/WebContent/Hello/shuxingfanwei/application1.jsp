<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import="java.util.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
application.setAttribute("name", "tianmai");
application.setAttribute("age", "28");

%>

<%
String namestr= (String)application.getAttribute("name");
String agestr= (String)application.getAttribute("age");

%>
<p>姓名：</p><%=namestr %>
<p>年龄：</p><%=agestr %>

<p>这是第一个页面</p>

<%--  <jsp:forward page="application2.jsp"></jsp:forward> --%>
<a href="application2.jsp">超链接</a>
</body>
</html>