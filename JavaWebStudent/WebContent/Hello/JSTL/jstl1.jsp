<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
 <%@page import="coo.javaweb.bean.*" %>

<jsp:useBean id="bb" class="coo.javaweb.bean.BookBean" scope="page" />

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>标准标签库常用四种标签</title>
</head>
<body>
<p style="color: red;">c:out 标签用于输出值</p>

	<p>
		<c:out value="hello world!"></c:out>
	</p>
	<p>
		<c:out value="null">你好</c:out>
	</p>
	value  不能省略
	
<p>c:out escapeXml</p>
<p>escapeXml="true"----><c:out value="<b><i>hello world!</i></b>" escapeXml="true"></c:out> </p>
<p>escapeXml="false"---><c:out value="<b><i>hello world!</i></b>" escapeXml="false"></c:out> </p>

<p>default</p>
k不存在所以输出的是default的值
<p>
<c:out value="${kkkk}" default="这是default默认输出的值"></c:out> </p>
<p>
<c:out value="${kkkk}" >
default="这是default默认输出的值"
</c:out> </p>


	<p style="color: red;">c:set 的两类四种输入方法</p>
	<p>
		<c:set var="name1" value="天霾" scope="page" />
		${name1}
	</p>
	<p>
		<c:set var="name2" scope="page">世俗</c:set>
		${name2}
	</p>
<p>
<%
BookBean book = new BookBean();
request.setAttribute("book", book);
%>
<c:set target="${book}" property="bookName" value="java大集合3"></c:set>
${book.bookName}<br/>
<c:set target="${book}" property="bookName" >java大集合4</c:set>
${book.bookName}
</p>
<p style="color: red;">c:remove 移除属性值的方法</p>
name2:${name1}
<c:remove var="name1" scope="page" />
<p>移除name2的属性的值 
:${name1}
</p>

<p>c:catch 抛出异常</p>
<p>直接输出异常：</p>

<c:catch >
${10/0}
</c:catch>
<p>Infinity：无穷大的意思</p>

<p>EL表达式输出异常信息（正常）</p>
<c:catch var="errmsg">
<%
int result=10/0;
%>
</c:catch>
<p>异常信息:${errmsg}</p>



</body>
</html>