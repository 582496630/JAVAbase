package chengfakoujue;

public class ChengFaKouJue {

	public static void main(String[] args) {

		//九九乘法口诀
		System.out.println("九九乘法口诀:");
		for (int x = 1; x < 10; x++) {
			for (int y = 1; y <=x; y++) {
				System.out.print(y + " * " + x + " = " + x * y+"\t");
			}
			System.out.println();
		}
	}

}
