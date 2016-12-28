package com.db.database.CURD;

import java.sql.DriverManager;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;

public class DeleteDemo {
	public static final String DBDRIVE = "com.mysql.jdbc.Driver";
	public static final String DBURL = "jdbc:mysql://localhost:3306/db_one";
	public static final String DBUSER = "root";
	public static final String DBPWD = "root";
	

	public static void main(String[] args) throws Exception {
		Class.forName(DBDRIVE);
		Connection conn = (Connection) DriverManager.getConnection(DBURL, DBUSER, DBPWD);
		
		String sql = "delete from cv where id=14;";
		Statement st = (Statement) conn.createStatement();
		
		int rs = st.executeUpdate(sql);
		System.out.println("删除数据成功"+rs);
		
		st.close();
		conn.close();
		
	}

}
