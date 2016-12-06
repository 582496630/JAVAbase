<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>page2</title>
</head>
<body>
<%
String info = pageContext.getRequest().getParameter("info");
%>
<p>info=<%=info %></p>
<p>realpath =<%=pageContext.getServletContext().getRealPath("/") %>
</p>

</body>
</html>