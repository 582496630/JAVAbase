<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<p>${'${'}a?0:1}:${a?0:1}</p>
<p>${'${'}A?0:1}:${A?0:1}</p>
<p>${'${'}b?0:1}:${b?0:1}</p>

<p>${'${'}empty""}:${empty""}</p>
<p>${'${'}empty" "}:${empty" "}</p>
<p>${'${'}true && false}:${true && false}</p>
<p>${'${'}true and false}:${true and false}</p>
<p>${'${'}true || false}:${true || false}</p>
<p>${'${'}true or false}:${true or false}</p>
<p>${'${'}!false}:${!false}</p>
<p>${'${'}not false}:${not false}</p>

</body>
</html>