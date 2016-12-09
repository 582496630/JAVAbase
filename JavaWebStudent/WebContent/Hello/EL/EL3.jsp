<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
        <%@page import="coo.javaweb.bean.*" %>
    <jsp:useBean id="book" class="coo.javaweb.bean.BookBean" scope="page">
    <jsp:setProperty name="book" property="bookName" value="aaaa"/>
    <jsp:setProperty name="book" property="bookNum" value="8888888"/>
    
    </jsp:useBean>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>


<body bgcolor="lldkkd">
<p>********************************</p>
<p><span>书名:----->${'${'}book.bookName}:</span>${book.bookName}</p>
<p><span>数量:----->${'${'}book.bookNum}:</span>${book.bookNum}</p>


</body>
</html>