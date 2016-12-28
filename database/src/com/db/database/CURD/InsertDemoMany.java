package com.db.database.CURD;

import java.sql.DriverManager;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

public class InsertDemoMany {
	//声明所需的常量  驱动、数据库地址、用户名、密码
	public static final String DBDRIVER = "com.mysql.jdbc.Driver";
	public static final String DBURL ="jdbc:mysql://localhost:3306/db_one";
	public static final String DBUSER = "root";
	public static final String DBPWD = "root";
	
//批量增加使用addBatch
	public static void main(String[] args) throws Exception {
		//注册驱动
		Class.forName(DBDRIVER);
		//调用Connection 类  建立与数据库的连接
		Connection conn = (Connection) DriverManager.getConnection(DBURL, DBUSER, DBPWD);
		//创建执行SQL的语句
		String tmp = "insert into cv (name,性别,age,num,年) values ";
		 PreparedStatement  prest = (PreparedStatement) conn.prepareStatement(tmp);
		//处理执行结果
		 
		 prest.addBatch(tmp+"('千山','男',52,23,2016);");
		 prest.addBatch(tmp+"('万径','男',32,33,2016);");
		 prest.addBatch(tmp+"('飞尽','男',92,26,2016);");
		 
		 prest.addBatch(tmp+"('孤舟','男',92,26,2016);");
		 prest.addBatch(tmp+"('老翁','男',92,26,2016);");

	int[] rs = prest.executeBatch();
	
	
	System.out.println("插入数据成功"+rs);
	
		//关闭数据流，只有在IO与数据库时用到了关闭数据流
		prest.close();
		conn.close();
		
	}

}
