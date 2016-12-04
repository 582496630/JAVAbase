<%@page import="com.sun.corba.se.impl.javax.rmi.CORBA.Util"%>
<%@page import="org.apache.jasper.tagplugins.jstl.core.Import"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page import="java.util.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<P>Hello&nbsp;World!</P>
	<%
		out.print("Hello&nbsp;World!");
	%>

	<%
		int rows = 10;
		int cols = 10;
		out.println("<table border=\"1\" width=\"50%\">");
		for (int x = 0; x < rows; x++) {
			out.println("<tr>");
			for (int y = 0; y < cols; y++) {
				out.println("<td>" + (x * y) + "</td>");

			}
			out.println("<tr/>");

		}
		out.println("</table>");
	%>

	<center>
	<p>
	
	现在的时间是：
	</p>
	<%@include file="systemTime.html" %>
	</center>
	
	
	
</body>
</html>