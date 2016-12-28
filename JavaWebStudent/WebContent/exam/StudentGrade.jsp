<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script type="text/javascript">

function add1() {
	window.location.href='GradeADD.jsp';//跳转到GradeADD.jsp页面添加信息
}
</script>
<title>学生成绩表</title>
</head>
<body>

<h1>学生成绩表</h1>

<input name="add" type="button" value="add" onclick="add1()"/>
<input name="update" type="button" value="update" />
<input name="delete" type="button" value="delete" />
<input name="select" type="button" value="select" />
<hr />
<table>
<tr>
<td>姓名</td>
<td>班级</td>
<td>课程</td>
<td>分数</td>
</tr>
<% 
//-- 从servlet的session中的获取nameSession的值  
List<String> list =(ArrayList)session.getAttribute("nameSession");
request.setAttribute("list1",list);
	%>
 	<% 
int n = 0;
 	
 	//这个地方条件不能是n<list.size()  因为刚开始打开页面是，list 是长度是0，所以会报错
while( n+1<7){
	
	%> 
<%!Integer n = 10;%>
<tr>
<!-- EL表达式里的变量都是为0 无法改变 -->
<%=n %>
<td>${list1.get(n)}</td>
<td>${list1[n+1]}</td>
<td>${list1[n+2]}</td>
<td>${list1[n+3]}</td>
<td>${list1}</td>
</tr>
	<%
	n = n + 4 ;
}
%>



</table>

</body>
</html>