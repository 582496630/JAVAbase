package test1;

public class Triangle {

	public static void test(String args[]) {

		int k1[];
		k1 = new int[5];
		k1[0] = Integer.parseInt(args[0]);
		int x = k1[0];

		System.out.println("輸入的行数為：     " + x + "底边长是 ：    " + (2 * x - 1));

		for (int i = 0; i < x; i++) {
			for (int j = 0; j < x - i; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < 2 * i + 1; j++) {
				System.out.print("*");
			}

			System.out.println();
		}
	}

	public static void test1(String args[]) {

		int k1[];
		k1 = new int[5];
		k1[0] = Integer.parseInt(args[0]);
		int x = k1[0];

		System.out.println("輸入的行数為：     " + x + "底边长是 ：    " + (2 * x - 1));

		for (int i = 0; i < x; i++) {
			for (int j = 0; j < i + 1; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < 2 * (x - i) - 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void test3(String args[]) {
		int x = 0;
		x = Integer.parseInt(args[0]);

		for (int i = 0; i < x ; i++) {
			for (int j = 0; j < 2 * x; j++) {
				if (j == x-i) {
					System.out.print("*");
				} else if (j == 2 * i + 1) {
					System.out.print("*");
				} else {

					System.out.print(" ");
				}
			}
			for (int n = i; n == x;) {
				System.out.println("*");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {

		System.out.println("1、实心正等腰三角形");
		Triangle.test(args);

		System.out.println();

		System.out.println("2、实心倒立等腰三角形");
		Triangle.test1(args);

		Triangle.test3(args);
	}

}
