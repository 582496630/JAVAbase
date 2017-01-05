<%@page import="java.sql.Statement"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Connection"%>
<%@page import="javax.sql.DataSource"%>
<%@page import="javax.naming.InitialContext"%>
<%@page import="javax.naming.Context"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>测试tomcat数据源</title>
</head>
<body>
<%
//使用InitialContext初始化Context
Context ctx = new InitialContext();
/* 通过JNDI查找数据源
java:comp/env 是tomcat固定的，tomcat提供的绑定都必须加该前缀
jdbc/jndi 在web.xml中定义数据源时的数据源名 */
DataSource ds = (DataSource)ctx.lookup("java:comp/env/jdbc/jndi");
//获取连接对象
Connection conn = ds.getConnection();
//获取Statement
Statement st =conn.createStatement();
//创建sql语句
String sql = "select * from cv";
//处理执行结果
ResultSet rs = st.executeQuery(sql);
while(rs.next()){
	//输出表内容
	out.println(rs.getInt("id")+"\t"+rs.getString("name")+"<br/>");
}


%>



</body>
</html>