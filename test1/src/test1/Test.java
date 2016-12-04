package test1;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


public class Test {

	public static void main(String[] args) throws Exception {

		Date date = new Date();
		
		System.out.println(date.clone());//返回此对象的副本
		System.out.println(date.getTime());//自1970年到现在的毫秒数
		System.out.println(date.toString());//自1970年到现在的毫秒数
		
		Date date2 = new Date();
		
		System.out.println(date2.toString());
		int boolean1=   date.compareTo(date2);
		System.out.println(boolean1);
		
		
		/*
		System.out.println(new Date( ) + "\n"); 
        Thread.sleep(1000*3);   // 让接下来的程序休眠3秒在运行  使用的时候需要抛异常
        System.out.println(new Date( ) + "\n");
        
        */
        
		Date date3 = new Date();
		SimpleDateFormat s= new SimpleDateFormat("y/M/d  k:m:s:S ");
        System.out.println(s.format(date3));
        
        
        
        Calendar c1=Calendar.getInstance();
        System.out.println(c1.toString());
        c1.set(2016,9,30);
        System.out.println(c1.getTime());
        int year = c1.get(Calendar.MONTH);
        System.out.println(year);
        
       
        
	}

}
