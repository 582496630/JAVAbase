<%@page import="java.util.Set"%>
<%@page import="java.util.Iterator"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>在线用户数量</h3>

	<%
		Set all = (Set) this.getServletContext().getAttribute("online");
	%>

	<%=all.size()%>
	<h2>在线用户列表</h2>
	<%
		Iterator iter = all.iterator();
		while (iter.hasNext()) {
	%>
	<%=iter.next()%>
	<%
		}
	%>

</body>
</html>