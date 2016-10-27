package test1;

public class TrianglePrint {

	public static void main(String[] args) {
 
/*		int n = Integer.valueOf(args[0]);
		int y = Integer.parseInt(args[1]);*/
       int  n,y;
		
		 n = 7;
		int a = 0;
		int b = 0;
		for (int i = n; i >= 1; i--) {
			if (a != (n - i)) {
				System.out.print(" ");
				a++;
				i = i + 1;
			} else if (b != (2 * i - 1)) {
				System.out.print("*");
				b++;
				i = i + 1;
			} else if (a == (n - i) && b == (2 * i - 1)) {
				System.out.println();
				a = 0;
				b = 0;
			}
	  }

  }
}
	
