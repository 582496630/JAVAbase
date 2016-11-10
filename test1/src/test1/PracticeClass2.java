package test1;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;

public class PracticeClass2 {

	public static void main(String[] args) throws IOException {

		// File file = new File("D:\\test\\text.txt");
		// File file2 = new File("D:\\text.txt");

		
		
		
		File file = new File("D:\\config.txt");
		Writer writer = new FileWriter(file);
		
		writer.write("这是一个JAVA上机题的文档文件:\r\n");
		writer.write("一个正整数，它加上100后是一个完全平方数，再加上168又是一个完全平方数，请问该数是多少？\r\n");
		writer.write("需要的参数如下，请通过程序读取本文件，解析下面的字符串得到需要的参数值:\r\n");
		writer.write("100#168#1000\r\n");
		writer.write("题目的要求是:在此文件中使用程序写入解题思路，同时在源码中，尽可能多写注释，让人一眼看懂代码逻辑\r\n");
		writer.write("将计算的结果，最后在写入这个配置文件的尾部，有多个结果时换行输出，以方便阅读。\r\n");
		writer.flush();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		int x = 1;            // 声明该整数为变量x
		
		//采用while循环来求出x的值
		while (true) {
			int a = (int) Math.sqrt(x + 100);//声明a、b，且a^2=x+100;b^2=x+168
			int b = (int) Math.sqrt(x + 168);

			//根据题目中a、b、x三个变量的关系，建立两个关系式为if语句的条件，来求出x的值
	 		if (a * a == (x + 100) && b * b == (x + 168)) {
	 			System.out.println("该正整数为："+x);
				break;
			}
			x = x + 1;
		}

		//求出了答案x的值，把解题思路与x的值在写入该文件中
		Writer writer2 = new FileWriter(file,true);
		System.out.println("向文件中追加解题思路与正确答案" );
		
		String str1 = "\r\n解题思路：因为根据题目可以得到两个关系式：a^2=x+100;b^2=x+168；因为a、b、x的值都不确定，"
				+ "\r\n所以需要用循环语句来求出x的值，我采用while循环，因为x的值要求是正整数，没有具体范围，所以while的循环条件是true，"
				+ "\r\n而题目中的两个关系式，可以用作if语句的条件，同时满足这两个条件，则输出的x值。"+"\r\n";
		String str2 = "\r\n该正整数x为："+x;
		
		writer2.write(str1);
		writer2.write(str2);
		System.out.println("输入成功");
		writer2.close();
	}

}
