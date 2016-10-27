package datetype;

public class FenZhi {

	public static void main(String[] args) {

		int x = Integer.parseInt(args[0]);
		
		System.out.println();
		System.out.println("x = "+x);
		
		// if else
		System.out.println();
		System.out.println("if else");
		if (x > 10) {
			System.out.println("x>10");
		} else {
			System.out.println("x<10");
		}
		
		// if else if else
		System.out.println();
		System.out.println("if else if else");

		if (x > 5) {
			System.out.println("x > 5 ");
		} else if (x < 3) {
			System.out.println("x < 3 ");
		}

		// switch
		System.out.println();
		System.out.println("switch");
		switch (x) {
		case 2:
			System.out.println("x = " + x);
			break;

		case 11:
			System.out.println("x = " + x);
			break;

		default:
			System.out.println("defalut x = " + x);
			break;
		}
		//?x:y
		System.out.println();
		System.out.println("?x:y");
		int m=(x>5)?10:-10;
		System.out.println("m = "+m);
		
	}

}
