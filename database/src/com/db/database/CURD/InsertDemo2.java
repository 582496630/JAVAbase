package com.db.database.CURD;

import java.sql.DriverManager;
import java.sql.Timestamp;
import java.util.Date;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

public class InsertDemo2 {
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
		String sql = "insert into cv (name,性别,age,num,出生日期,现在时间) values (?,?,?,?,?,?); ";
		 PreparedStatement  prest = (PreparedStatement) conn.prepareStatement(sql);
		//处理执行结果
	prest.setString(1, "小布");
	prest.setString(2, "男");
	prest.setInt(3, 98);
	prest.setInt(4, 79);
	
	Timestamp date2 =new Timestamp(100,11,01,14,23,50,569);
	Timestamp date1 =new Timestamp(92,10,01,14,23,50,569);
	
	prest.setTimestamp(5,date2);
	prest.setTimestamp(6,date1);
	int rs = prest.executeUpdate();
	
	System.out.println("插入数据成功"+rs);
	
		//关闭数据流，只有在IO与数据库时用到了关闭数据流
		prest.close();
		conn.close();
		
	}

}
