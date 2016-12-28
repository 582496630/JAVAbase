package com.db.database.shiwu;

import java.sql.DriverManager;
import java.sql.Savepoint;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

public class InsertDemoManyShiWu2 {
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
		Savepoint sp = null;
		Savepoint sp1 = null;
		try {
		 prest.executeUpdate(tmp+"('千山','男',52,23,2016);");
		 prest.executeUpdate(tmp+"('万径','男',32,33,2016);");
		 prest.executeUpdate(tmp+"('飞尽','男',92,26,2016);");
		 sp = conn.setSavepoint();
		//错误引入
		 prest.executeUpdate(tmp+"('孤舟‘,'男',92,26,2016);");
		 sp1 = conn.setSavepoint();
		 //错误引入
		 prest.executeUpdate(tmp+"('老翁’,'男',92,26,2016);");
		 
			 conn.commit();
			 System.out.println("批量插入数据成功");
		 } catch (Exception e) {
			 if (sp1 !=null) {
				
				 conn.rollback(sp1);
				 conn.commit();
				 System.out.println("出现异常sp1，回滚！");
			}else if(sp!=null){
				conn.rollback(sp);
				conn.commit();
				System.out.println("出现异常sp，回滚！");
			}
		 }
		//如果关闭流失败，就在关闭一次，异常语句
		try {
			prest.close();
		} catch (Exception e) {
			prest.close();
			e.printStackTrace();//注释这一句，就不会提示异常错误信息
		}
		try {
			conn.close();
		} catch (Exception e) {
			conn.close();
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
