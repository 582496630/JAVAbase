package test.oob.exception;

public class ExceptionDemo3 {

	public static void main(String[] args) {

		int x;
		int y;
		int z = 1;

		try {
			x = Integer.parseInt(args[0]);
			y = Integer.parseInt(args[1]);
			z = x / y;
		} catch (ArrayIndexOutOfBoundsException e) {

			System.out.println("我现在捕获到数组越界异常，我打印的堆栈信息如下：");
			e.printStackTrace();
		} catch (ArithmeticException e) {

			System.out.println("我现在捕获到算法异常---除数为0，我打印的堆栈信息如下：：");
			e.printStackTrace();

		}finally {
			System.out.println("无论错误或者异常如何，我都 会被执行！----我是finally 语句块 ");
		}

		System.out.println("z=x/y    z= " + z);
	}

}
