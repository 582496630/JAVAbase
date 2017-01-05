package com.db.database.driver;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.Statement;

//注意引入的包不要引入错误
public class ConnectDemo2 {
	public static  final String DBDRIVER = "com.mysql.jdbc.Driver";
	//？后面的编码方式是为了确保 内容不乱码
	public static final String DBURL ="jdbc:mysql://localhost:3306/db_one?useUnicode=true&characterEncoding=UTF-8";
	public static final String DBUESR = "root";
	public static final String DBPWD = "root";
	public static void main(String[] args) throws Exception {
		Class.forName(DBDRIVER);
		Connection conn = DriverManager.getConnection(DBURL, DBUESR, DBPWD);
		Statement st = conn.createStatement();
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
