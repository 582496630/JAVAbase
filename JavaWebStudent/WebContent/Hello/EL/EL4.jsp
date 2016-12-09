<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<%
Cookie c1=new Cookie("country","China");
c1.setMaxAge(120);
response.addCookie(c1);
%>

<body bgcolor="lldkkd">
<p>********************************</p>
<!-- EL表达式输出cookie的值 -->
<p>EL表达式输出：${cookie.country.name}
</p>
<p>EL表达式输出：${cookie.country.value}
</p>

<p>表达式输出：<%=c1.getName() %>---><%=c1.getValue() %></p>

<hr/>
<!-- 修改web.xml之后 获取不到，就重启tomcat服务器 -->
<p>${'${'}initParam.EL}:
${initParam.EL}
</p>
<p>表达式输出：
<%=(String)application.getInitParameter("EL") %>
</p>
</body>
</html>