package datetype;

import java.io.PrintStream;

public class Cycl {

	public static void main(String[] args) {
		PrintStream out = System.out;

		// for 循环
		out.println();
		out.println("for 循环");
		for (int i = 0; i < 3; i++) {
			out.println("i = " + i);
		}
		// while 循环
		out.println();
		out.println("while 循环");
		int j = 6;
		while (j > 3) {
			out.println("j = " + j);
			j--;
			out.println("j = " + j);
		}
		// do while
		out.println();
		out.println("do while 循环");
		int m = 7;
		do {
			out.println("m = " + m);
			m++;
			out.println("m = " + m);
		} while (m < 10);
		
		//foreach
		out.println();
		out.println("foreach 循环");
		int[] shuzu = {12,34,56,78,91};
		for (int n : shuzu) {
			out.println("shuzu = "+ n);
		}
        
		
	}

}
