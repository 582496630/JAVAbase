package com.db.database.CURD;

import java.sql.DriverManager;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;

public class DeleteDemo2 {
	public static final String DBDRIVE = "com.mysql.jdbc.Driver";
	public static final String DBURL = "jdbc:mysql://localhost:3306/db_one";
	public static final String DBUSER = "root";
	public static final String DBPWD = "root";
	

	public static void main(String[] args) throws Exception {
		Class.forName(DBDRIVE);
		Connection conn = (Connection) DriverManager.getConnection(DBURL, DBUSER, DBPWD);
		
		String tablename = "cv";
		String sql = "delete from "+tablename+" where id = 13;";
		PreparedStatement prest = (PreparedStatement) conn.prepareStatement(sql);
		 //prest.setInt(1, 17); 报错
		int rs = prest.executeUpdate(sql);
		System.out.println("删除数据成功"+rs);
		
		prest.close();
		conn.close();
		
	}

}
