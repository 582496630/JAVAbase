package exam;
/*要求输出可以自动变换大小的三角形，这就需要手动去输入一个值，这个就需要用到数组，
 * 然后把这个输入的数组的值赋值给一个变量x；
 * 程序主体部分可以用内嵌的for循环来控制空格与“*”的输出；
 * 三角形要求改变，可以用变量x为三角形的行数，可以通过i<x来控制最外层的for循环
 * 以正实心三角形为例，假如行数是5，那第一行就是4个空格一个*，第二行3个空格3个*,
 * 最后一行是0个空格，11个*，总结出，如果i表示第几行，则每行的空格数可以是x-i,*的数量是2*i+1
 * 因为一个空格一个*都是输出一次，所以可以用x-i与2*i+1为for语句的条件来输出*/

public class TrianglePrint {

	public static void Triangle1(String args[]) {

		int x = 0;
		x = Integer.parseInt(args[0]);// 把输入数组args[0]，并赋值给行数x

		System.out.println("输入的数及三角形的高为：     " + x);

		for (int i = 0; i < x; i++) {
			for (int j = 0; j < x - i; j++) {
				System.out.print(" "); // 通过for循环语句输出空格
			}
			for (int j = 0; j < 2 * i + 1; j++) {
				System.out.print("*"); // 通过for循环语句输出*
			}
			System.out.println(); // 每行结束换行
		}

	}

	public static void Triangle2(String args[]) {

		int x = 0;
		x = Integer.parseInt(args[0]); // 把输入数组args[0]，并赋值给行数x
		System.out.println("输入的数及三角形的高为：     " + x);

		for (int i = 0; i < x; i++) {
			for (int j = 0; j < i + 1; j++) {
				System.out.print(" "); // 通过for循环语句输出空格
			}
			for (int j = 0; j < 2 * (x - i) - 1; j++) {
				System.out.print("*"); // 通过for循环语句输出*
			}
			System.out.println(); // 每行结束换行
		}

	}
	
	public static void Triangle3(String args[]){
		int x;
		x = Integer.parseInt(args[0]);
		System.out.println("输入的数及三角形的高为：     " + x);

		for (int i = 0; i < x; i++) {

			for (int j = 0; j < x + i; j++) {
				if (j == x - i - 1 || j == x + i - 1 || i == x - 1) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println("");
		}

	}
	
	public static void Triangle4(String args[]){
		
		int x;
		x = Integer.parseInt(args[0]);
		System.out.println("输入的数及三角形的高为：      " + x);

		for (int i = 0; i < x; i++) {
			for (int j = 0; j < x * 2 - 1; j++) {
				if (i == 0 || j == i || j == 2 * (x - 1) - i) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println("");
		}
	}

	public static void main(String[] args) {

		System.out.println("输入数值请大于等于2");
		
		System.out.println("1、实心正等腰三角形");
		TrianglePrint.Triangle1(args); // 调用方法Triangle1

		System.out.println();

		System.out.println("2、实心倒立等腰三角形");
		TrianglePrint.Triangle2(args); // 调用方法Triangle2

		System.out.println("2、空心正等腰三角形");
		TrianglePrint.Triangle3(args); // 调用方法Triangle3
		
		System.out.println("2、空心倒立等腰三角形");
		TrianglePrint.Triangle4(args); // 调用方法Triangle3
	}
}
