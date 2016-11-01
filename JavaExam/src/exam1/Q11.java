package exam1;

public class Q11 {

	public static void main(String[] args) {

		int x;
		x = Integer.parseInt(args[0]);
		System.out.println("输入的数为： " + x);

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

}
