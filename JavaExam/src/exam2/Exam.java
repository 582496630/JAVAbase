package exam2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.sun.org.apache.bcel.internal.generic.NEW;

public class Exam  {

	public static void math() throws Exception{
		
		int x,y,z=0,p,max,min,num=0;
		
		Scanner scanner = new Scanner(System.in);
		List<Integer> list = new ArrayList<Integer>();
		System.out.println("输入一个范围及x的值： ");
		x=scanner.nextInt();//整数范围
		System.out.println("输入一个被整除的数及y的值： ");
		y=scanner.nextInt();//被除数
		
		for (int i = 1; i < x; i++) {
			if (i%y==0) {
				z=z+i;
			    num = num + 1;
				list.add(i);
			}	
		}
		p=z/num;
		max=list.get(num-1);
		min=list.get(0);
		
		System.out.println("总数"+z);
		System.out.println("平均数"+p);
		System.out.println("一共有 "+num+"个数满足条件");
		System.out.println("这些数分别是"+list.toString());
		
		File file = new File("D:\\Exam1.txt");
		FileWriter fw = new FileWriter(file);
		
		String str = "题目"+ " \r\n1.计算XX以内所有能被7整除的数的和以及平均数。" + "\r\n要求："
				+ "\r\nA.xx的值从控制台用Scanner读取；创建文本文件，将当前题目及要求写入文档" 
				+"\r\nB.代码编写要具有灵活性，不要我随便改个参数导致你的代码，" + "大面积修改！！"
				+ "\r\nC.在文档中打出解题思路，同时输出从控制台读取的值，符合条件的数有几个？对符合条件的数，排序输出！和是多少，" 
				+ "平均数是多少，最大值是多少，最小值是多少" 
				+"\r\n"+ "\r\n解题思路："+ "\r\n-------------------"
				+"\r\n控制台输入范围m的值为: " + x +"; 被整除的数"+y+ "; 符合条件的数有： " + num + "个; 分别是： " + list.toString() + "\r\n这些数的总和是:" + y
				+ "; 平均数是:" + p + "; 最大值是:" + max + "; 最小值是:" + min;
		fw.write(str);
		fw.close();
		
	}
}