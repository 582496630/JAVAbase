package datetype;

import java.io.PrintStream;

public class DateType {

	public static void main(String[] args) {
		
		//integer
		int x, y = 3;
		x = 7;
		PrintStream prts = System.out;
		prts.println();
		prts.println("int Demo");
		prts.println("x + y = " + (x + y) + ";");
		prts.println("x - y = " + (x - y) + ";");
		prts.println("x * y = " + (x * y) + ";");
		prts.println("x / y = " + (x / y) + ";");
		prts.println("x % y = " + (x % y) + ";");
		
		//char
		char m, n = 'c';
		m = 'b';
		prts.println();
		prts.println("Char Demo");
		prts.println("m + n = " + (m + n) + ";");
		prts.println("m = " + m + ";");
		prts.println("n = " + n + ";");

		//float
		float i, j = 3;
		i = (float) 6.8;
		prts.println();
		prts.println("Float Demo");
		prts.println("i + j = " + (i + j) + ";");
		prts.println("i - j = " + (i - j) + ";");

		boolean a, b;
		a = true;
		b = false;
		prts.println();
		prts.println("Boolean Demo");
		prts.println("a && b =" + (a && b) + ";");
		prts.println("a || b =" + (a || b) + ";");
		prts.println("!a =" + (!a) + ";");
		prts.println("!b =" + (!b) + ";");

		String c, d;
		c = "Hello    ";
		d = "what's your name?";
		prts.println();
		prts.println("String Demo");
		prts.println("c + d = " + (c + d) + ";");
		prts.println("m + n = " + String.valueOf(m) + String.valueOf(n) + ";");
	}

}
