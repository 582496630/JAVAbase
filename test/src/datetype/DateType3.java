package datetype;

import java.io.PrintStream;


public class DateType3 {

	public static void main(String[] args) {

		PrintStream out = System.out;

		int a, b;
		a = 9;
		b = 5;
		out.println("a = " + Integer.toBinaryString(a));
		out.println("b = " + Integer.toBinaryString(b));

		out.println();
		out.println("a & b = " + (a & b));
		out.println("a & b = " + Integer.toBinaryString(a & b));

		out.println();
		out.println("a | b = " + (a | b));
		out.println("a | b = " + Integer.toBinaryString(a | b));

		out.println();
		out.println("a ^ b = " + (a ^ b));
		out.println("a ^ b = " + Integer.toBinaryString(a ^ b));

		out.println();
		out.println("~a = " + (~a));
		out.println("~a = " + Integer.toBinaryString(~a));

		out.println();
		out.println("a >> 2 = " + (a >> 2));
		out.println("a >> 2 = " + Integer.toBinaryString(a >> 2));

		out.println();
		out.println("a << 2 = " + (a << 2));
		out.println("a << 2 = " + Integer.toBinaryString(a << 2));

	}

}
