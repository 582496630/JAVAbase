<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
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
	<%
		String str = "155a45,dqawe;rrass!ppapp.oeaidh";
		pageContext.setAttribute("str", str);
	%>
	
		<c:forTokens items="${str }" delims="a" var="ot" varStatus="va">
       ${va.count}、 ${ot}<br />
		</c:forTokens>
	<hr />
	<c:forTokens items="${str }" delims=",;!." var="ot" varStatus="va">
       ${va.count}、 ${ot}<br />
</c:forTokens>
	
	<p>输出数组forEach</p>
	<%
	List<String> all = new ArrayList<String>();
	all.add("aaaa");
	all.add("bbbb");
	all.add("cccc");
	all.add("dddd");
	pageContext.setAttribute("list", all);
	%>
	
	<c:forEach items="${list }" var="listout"  >${listout }、</c:forEach>
	
	
</body>
</html>