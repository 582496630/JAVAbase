<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

	<!-- 动态include导入 -->
	<!-- jsp文件引用html文件，如果html内也有引用的的文件如图片，那么该图片要以jsp的路径引用到html中，
	否则，jsp会显示不了该图片 -->
	<jsp:include page="../html/newBook1.html" flush="true"></jsp:include>
	<jsp:include page="../html/newBook2.html" flush="true"></jsp:include>
	<jsp:include page="../html/newBook3.html" flush="true"></jsp:include>
	<jsp:include page="../html/newBook4.html" flush="true"></jsp:include>


	<!-- 静态include导入 -->
	<%@include file="Hello2.jsp"%>
	<%@include file="../html/newBook1.html"%>

</body>
</html>