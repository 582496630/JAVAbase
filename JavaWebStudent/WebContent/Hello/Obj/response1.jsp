<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%! 
int count = 0;
%>
<%
response.setHeader("refresh", "1");
%>
<p>当前页面刷新（refresh）次数：</p><%=count++%>
<%
if(count>10){
	//两种页面跳转方式
//response.setHeader("refresh","0;url='http://www.baidu.com'");
	response.sendRedirect("http://www.baidu.com");
}
%>

</body>
</html>