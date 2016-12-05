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
String  RemoteAddr = request.getRemoteAddr();
HttpSession  getSession = request.getSession();
//String  RemoteAddr = request.getRemoteAddr();
//String  RemoteAddr = request.getRemoteAddr();


%>
<p>RemoteAddr:<%= RemoteAddr%></p>
</body>
</html>