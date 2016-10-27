package Arrary;

public class Wan {

	public static void main(String[] args) {

		int array[] = { 25, 56, 48, 22, 15, 9, 7, 85, 65, 35, 54, 12 };

		int m, n;
		m = array[0];
		n = array[0];
		for (int i = 1; i < array.length; i++) {
			if (m < array[i]) {
				m = array[i];
			} else if (n > array[i]) {
				n = array[i];
			}
		}
System.out.println("最大值：  "+m);
System.out.println("最小值：  "+n);
	}

}
