<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>学生成绩表--填写信息</title>
</head>
<body>
<form action="<%=request.getContextPath()%>/servlet/StudentGrade" method="get">
<table border="1">
<tr>
<td>姓名</td>
<td><input name="name" type="text" /></td>
</tr>
<tr><td>班级</td>
<td><input name="banji" type="text" /></td>

<tr><td>课程</td>
<td><input name="core" type="text" /></td>
</tr>
<tr><td>分数</td>
<td><input name="fenshu" type="text" /></td>
</tr>
</table>
<input name="submit" type="submit" value="提交" /> 
<input name="reset" type="reset" value="重置" /> 
</form>
</body>
</html>