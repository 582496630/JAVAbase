<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%-- <c:import url="../Hello.jsp" var="hello" scope="page" />
${hello} --%>
<%-- <c:import url="../Hello.jsp"  /> --%>
<%-- <c:import url="http://www.baidu.com" charEncoding="utf-8" /> --%>
<c:url value="../Hello.jsp"></c:url>
<c:url value="../Hello.jsp" var="hello" scope="page"></c:url>
<a href="${hello }">tiaozhan</a>

<c:redirect url="${hello }"></c:redirect>
</body>
</html>