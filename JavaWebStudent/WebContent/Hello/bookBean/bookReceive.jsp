<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import="coo.javaweb.bean.*" %>
    <jsp:useBean id="book" class="coo.javaweb.bean.BookBean" scope="page">
    <jsp:setProperty name="book" property="bookName" />
    <jsp:setProperty name="book" property="bookNum" />
    
    </jsp:useBean>
    
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>图书订购</title>
</head>
<body>
<p>订购图书清单
</p>
<hr/>
书名：<%=book.getBookName() %><br>
数量：<%=book.getBookNum() %><br>

</body>
</html>