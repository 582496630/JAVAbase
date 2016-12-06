<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>session.isNew()</title>
</head>
<body>
	<%
		if (session.isNew()) {
	%>

	<p>欢迎新用户登陆</p>
	<p>请刷新页面</p>
	<input name="button" type="button" value="刷新页面"
		onclick="location.reload()" />
	<%
		} else {
	%>
	<p>你已经是老用户了！</p>
	<%
		}
	%>


	<%
	//取得创建时间
	long start = session.getCreationTime();
	//取得最后一次操作时间
	long end = session.getLastAccessedTime();
	//一共操作了多长时间
    long time = (end-start)/1000;
	
	%>
	
<p>CreationTime： <%=start %>毫秒！</p>
<p>LastAccessedTime： <%=end %>毫秒！</p>
<p>您已经工作了<%=time %>秒！</p>

</body>
</html>