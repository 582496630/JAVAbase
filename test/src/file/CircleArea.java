package file;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

//要求，从控制台输入圆的半径  r ,来输出圆的面积，r 只能为整数，输入其它值报错，并要求重新输入，直到输入对的为止
public class CircleArea {

	public static void main(String[] args) throws IOException {

		PrintStream out = System.out;

		int r;       //声明圆的半径
		double s;    //声明圆的面积，为了精确所以是double型

		Scanner scanner = new Scanner(System.in);   //scanner 用法
		out.println("请输入圆的半径 r为:");        

		//while循环来限制用户输入正确的值
		while (!scanner.hasNextInt()) {

			out.println("您输入错误，请重新输入  r 的值:");
			Scanner scanner2 = new Scanner(System.in);   //用于循环内部让用户输入新的值

			if (scanner2.hasNextInt()) {      //分支语句，用户输入正确则输出S 的值，并return，跳出程序
				r = scanner2.nextInt();
				s = 3.14 * r * r;
				out.println();
				out.println("圆面积s是:" + s);
				return;
			}
		}
		
		//如果用户第一次输入的值是对的，就不用执行while循环语句，直接就可以输出S 的值
		r = scanner.nextInt();
		s = 3.14 * r * r;
		out.println();
		out.println("圆面积s是:" + s);
		scanner.close();
	}

}
