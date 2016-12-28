package com.db.database.CURD;

import java.sql.DriverManager;
import java.sql.ResultSet;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

public class SelectDemo {
	//声明所需的常量  驱动、数据库地址、用户名、密码
	public static final String DBDRIVER = "com.mysql.jdbc.Driver";
	public static final String DBURL ="jdbc:mysql://localhost:3306/db_one";
	public static final String DBUSER = "root";
	public static final String DBPWD = "root";
	

	public static void main(String[] args) throws Exception {
		//注册驱动
		Class.forName(DBDRIVER);
		//调用Connection 类  建立与数据库的连接
		Connection conn = (Connection) DriverManager.getConnection(DBURL, DBUSER, DBPWD);
		//创建执行SQL的语句
		Statement st = (Statement) conn.createStatement();
		String sql = "select * from cv";
		//处理执行结果
		ResultSet rs = st.executeQuery(sql);
		     //遍历数据库中表的内容
		while(rs.next()){
			String name = rs.getString("name");
			int age = rs.getInt("age");
			System.out.print("name:"+name+"\t\t");
			System.out.print("age:"+age);
			System.out.println();
		}
		//关闭数据流，只有在IO与数据库时用到了关闭数据流
		rs.close();
		st.close();
		conn.close();
		
	}

}
