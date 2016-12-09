<%@page import="java.util.Set"%>
<%@page import="java.util.TreeSet"%>
<%@page import="java.util.HashMap"%>
<%@page import="java.util.Map"%>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
List<String> list = new ArrayList<String>();
list.add("aaa");
list.add("bbb");
list.add("ccc");
list.add("ddd");
list.add("eee");
request.setAttribute("list",list);

Map<String,String> map = new HashMap<String,String>();
map.put("1", "nihao");
map.put("2", "buhao");
map.put("3", "haobuhao");
request.setAttribute("map", map);

Set<String> set = new TreeSet<String>();
set.add("aaa");
set.add("sss");
set.add("ddd");
set.add("fff");
request.setAttribute("set", set);

//数组
String[] strArray = {"A01","A02","A03","A04"};
pageContext.setAttribute("strArray", strArray);
%>
<p>EL--list</p>
<p>${list}</p>
<p>${list[0]}</p>
<p>${list[1]}</p>
<p>${list[2]}</p>
<p>${list.get(3)}</p>
<p>可以通过索引、get索引来获取值</p>
<p>EL-map</p>
<p>${map}</p>
<p>${map["1"]}</p>
<p>${map["2"]}</p>
<p>${map.get("3")}</p>
<p>可以通过键key、get键key来获取值</p>

<p>EL-set</p>
<p>${set}</p>
<%-- <p>${set.get(2)}</p> --%>
<p>只能整个输出，不能通过索引输出</p>

	<hr/>
	<p>${'${'}strArray}:</p>${strArray}<br/>
	<p>${'${'}strArray[0]}:</p>${strArray[0]}<br/>
	<p>${'${'}strArray[2]}:</p>${strArray[2]}<br/>
	<p>${'${'}strArray[2]}:</p>${strArray[2]}<br/>
<%-- 	<p>${'${'}strArray.A01}:</p>${strArray.A01}<br/> --%>
	<%-- <p>${'${'}strArray["A01"]}:</p>${strArray["A01"]}<br/> --%>
	<p>数组的取值，只能使用[]和索引来取值！</p>



</body>
</html>