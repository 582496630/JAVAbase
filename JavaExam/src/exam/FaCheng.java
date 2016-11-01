package exam;

/*一元二次方程，知道其解的表达式，把其表达式分拆开可以用JAVA表示的小部分，
 *每一个部分用一个变量代替，在组合在一起，赋值给x；*/

public class FaCheng {

	public static void main(String[] args) {

		// 接收从后台输入a、b、c三个数的值
		int a = 1;
		int b = Integer.parseInt(args[1]);
		int c = Integer.parseInt(args[2]);

		// 声明各个部分的变量，并相互赋值
		int m = 4 * a * c;
		int j = b * b;
		int i = j - m;
		int o = (int) Math.sqrt(i);// 取i数值的根
		int k = -b;
		int n;
		int x = 1;
		int y = 1;

		// 捕捉异常语句
		try {
			a = Integer.parseInt(args[0]);
			n = 2 * a;
			x = (k + o) / n;
			y = (k - o) / n;
		} catch (Exception e) {

			System.out.println("我现在捕获到算法异常---除数为0，我打印的堆栈信息如下：：");
			e.printStackTrace();
		}

		System.out.println("当 a = " + a + "  b = " + b + "  c = " + c);

		System.out.println("ax2+bx+c=0   的解x1的值为： " + x);
		System.out.println("ax2+bx+c=0   的解x2的值为： " + y);

	}

}
