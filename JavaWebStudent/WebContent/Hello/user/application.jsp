<%@page import="java.util.Enumeration"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<% 
//常用的三个方法
String path = application.getContextPath();

%>
<p>虚拟路径：<%=path %></p>
<% 
//String path1 = application.getRealPath("/");
String path1 = this.getServletContext().getRealPath("/");
%>
<p>真实路径：<%=path1 %></p>
<%
Enumeration enu= this.getServletContext().getAttributeNames();


while(enu.hasMoreElements()){
		String name = (String) enu.nextElement() ;
%>
		<h4><%=name%> --> <%=this.getServletContext().getAttribute(name)%></h4>
<%
	}
%>
</body>
</html>