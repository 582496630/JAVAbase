package com.db.database.driver;

import java.sql.DriverManager;
import java.sql.ResultSet;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

public class ConnectDemo2 {
	public static  final String DBDRIVER = "com.mysql.jdbc.Driver";
	public static final String DBURL="jdbc:mysql://localhost:3306/db_one2";
	public static final String DBUESR = "root";
	public static final String DBPWD = "root";
	public static void main(String[] args) throws Exception {
		Class.forName(DBDRIVER);
		Connection conn = (Connection) DriverManager.getConnection(DBURL, DBUESR, DBPWD);
		Statement st = (Statement) conn.createStatement();
		String sql = "select * from 登陆账号";
		
		ResultSet rs = st.executeQuery(sql);
		
		while(rs.next()){
			
			String id = rs.getString(1);
			String name = rs.getString("name");
			String pwd = rs.getString("password");
			System.out.print(id+"\t");
			System.out.print("name: "+name+"\t");
			System.out.print("password: "+pwd+"\n");
			
		}
		
	}

}
