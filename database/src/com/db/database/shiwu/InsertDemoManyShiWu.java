package com.db.database.shiwu;

import java.sql.DriverManager;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

public class InsertDemoManyShiWu {
	public static final String  DBDRIVE= "com.mysql.jdbc.Driver";
	public static final String DBURL ="jdbc:mysql://localhost:3306/db_one";
	public static final String DBUSER = "root";
	public static final String DBPWD = "root";
	
	public static void main(String[] args) throws Exception {
		Class.forName(DBDRIVE);
		Connection conn = (Connection) DriverManager.getConnection(DBURL, DBUSER, DBPWD);
		
		String tmp = "insert into cv (name,性别,age,num,年) values";
		PreparedStatement prest = (PreparedStatement) conn.prepareStatement(tmp);
		conn.setAutoCommit(false);
		 prest.addBatch(tmp+"('千山','男',52,23,2016);");
		 prest.addBatch(tmp+"('万径','男',32,33,2016);");
		 prest.addBatch(tmp+"('飞尽','男',92,26,2016);");
		 
		 prest.addBatch(tmp+"('孤舟','男',92,26,2016);");
		 prest.addBatch(tmp+"('老翁','男',92,26,2016);");
		int ts[] = prest.executeBatch();
		conn.rollback();
		//conn.commit();
		System.out.println("批量插入数据成功"+ts.length);
		
		prest.close();
		conn.close();
	}

}
