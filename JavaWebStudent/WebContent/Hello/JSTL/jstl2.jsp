<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<c:if test="${10<30}" var="sss" scope="page">
<p>10比30小！</p>
</c:if>

<c:if test="${10<30}" var="zhi" scope="page">
<p>10比30da！</p>
</c:if>
<form action="jstl2.jsp">
输入成绩：<input name="chengji" type="text" />
<input name="submit" type="submit" value="提交" />
<input name="reset" type="reset" value="重置" />
</form>
<c:set var="color" value="red"  ></c:set>
<c:set var="n" value="${param.chengji }"  ></c:set>


<p>

<c:if test="${n>=60&&n<=100}" >
<c:set var="color" value="blue"></c:set>
</c:if>
<font color="${color}" size="6">
<c:choose>
<c:when test="${ n==null}">

</c:when>

<c:when test="${n>100||n<0}">
请输入正确成绩！
</c:when>
<c:when test="${n<60}">
不及格！！！
</c:when>
<c:when test="${n<70&&n>=60}">
刚及格！！请再接再厉！
</c:when>
<c:when test="${n<80&&n>=70}">
成绩中等！！请再接再厉！
</c:when>
<c:when test="${n<90&&n>=80}">
成绩良好！！继续加油！！
</c:when>
<c:when test="${n<100&&n>=90}">
成绩优秀！！继续保持！
</c:when>
<c:otherwise>
恭喜你，你满分！！！
</c:otherwise>
</c:choose>
</font>
</p>
</body>
</html>