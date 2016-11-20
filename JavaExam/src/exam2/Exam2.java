package exam2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exam2  {

	// 声明变量，x:满足条件的整数；y:满足条件的所有整数的和；j:满足条件的整数的个数;max:满足条件的一组数中的最大值;min满足条件的一组数中的最小值
	static int x, y = 0, j = 0, max, min;
	static int m; // m:表示整数的范围；n:表示被整除的数
	static double s;// 平均数

	static // 定义个容器list，存放满足条件的数
	List<Integer> list = new ArrayList<Integer>();

	// 抛出异常
	public static void throw1() throws Exception {
		if (m <= 0) {
			throw new ShuJuLeiXingCuoWu();// 自定义的异常类
		}
	}

	// 根据题意写出的程序过程
	public static void zhengchu() throws Exception {
		Scanner scanner = new Scanner(System.in);

		try {
			System.out.println("请输入m:");
			m = scanner.nextInt();

			Exam2.throw1();

		} catch (ShuJuLeiXingCuoWu e) {
			e.printStackTrace();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		for (int i = 1; i <= m; i++) {
			if (i % 7 == 0) {

				x = i;
				y = y + x;// 整除7的数的总和

				j++;// x的个数，每触发IF语句一次，就代表有一个满足条件的x；
				list.add(x);

			}

		}
		min = list.get(0);
		max = list.get(j - 1);

		System.out.println("一共有j个x满足:j = " + j);
		System.out.println("总数y = " + y);
		s = y / j;// 平均数
		System.out.println(m + " 范围内所有能整除    7" + " 的值的和的平均数为: " + s);
		System.out.println("这些数分别是： " + list.toString());
		System.out.println("这些数的最大值max是： " + max);
		System.out.println("这些数的最小值min是： " + min);
	



		// 引用scanner类，从控制台输入m,n的值


	

		File file = new File("D:\\Exam2.txt");
		OutputStream outs = new FileOutputStream(file);

		Writer writer = new OutputStreamWriter(outs, "GBK");

		String String = "题目：" + " \r\n1.计算XX以内所有能被7整除的数的和以及平均数。" + "\r\n要求："
				+ "\r\nA.xx的值从控制台用Scanner读取；创建文本文件，将当前题目及要求写入文档" + "\r\nB.代码编写要具有灵活性，不要我随便改个参数导致你的代码，" + "大面积修改！！"
				+ "\r\nC.在文档中打出解题思路，同时输出从控制台读取的值，符合条件的数有几个？对符合条件的数，排序输出！和是多少，" + "平均数是多少，最大值是多少，最小值是多少" +"\r\n"+ "\r\n解题思路："
				+ "\r\n-------------------";
		String str2 = "\r\n控制台输入范围m的值为: " + m + "; 符合条件的数有： " + j + "个; 分别是： " + list.toString() + "\r\n这些数的总和是:" + y
				+ "; 平均数是:" + s + "; 最大值是:" + max + "; 最小值是:" + min;
		writer.write(String);
		writer.write(str2);

		System.out.println("输入成功");
		writer.close();
  }
}
	
