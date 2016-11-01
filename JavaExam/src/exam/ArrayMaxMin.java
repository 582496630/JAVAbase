package exam;

import java.io.PrintStream;
import java.util.Scanner;

/*求一个数组内部最大值跟最小值，首先要声明两个数组变量m、n，都赋值给数组中第一位的值，
 * 然后通过for循环语句让m、n与数组中所有的值比较大小，用if分支语句来写比较过程，并
 * 让数组最大的值赋值给m，最小的值赋值给n；然后通过运算符“+”与“/”来求最大值与最小值的平均值*/

public class ArrayMaxMin {

	private static Scanner input;

	public static void main(String[] args) {

		PrintStream out = System.out;

		// int a[] = { 12, 67, 8, 98, 23, 56, 124, 55, 99, 100 };

		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一串整数并在输入时用英文逗号隔开：");
		String inputString = sc.next().toString();
		String stringArray[] = inputString.split(",");
		int a[] = new int[stringArray.length];
		
		
		for (int i = 0; i < stringArray.length; i++) {
			a[i] = Integer.parseInt(stringArray[i]);
			out.print(a[i]+" ");

		}
         out.println();
         
		int x;
		int m = a[0];
		int n = a[0];

		for (int i = 0; i < a.length; i++) {
			if (m < a[i]) {
				m = a[i];
			} else if (n > a[i]) {
				n = a[i];
			}
		}

		out.println("a数组的最大值m为：   " + m);
		out.println("a数组的最小值n为：   " + n);
		x = (m + n) / 2;
		out.println("数组的最大值m与最小值n的和的平均值x的值为：   " + x);
	}

}
