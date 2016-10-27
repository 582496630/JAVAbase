package test;
import java.io.PrintStream;


public class Bianliang {

	public static void main(String[] args) {
		PrintStream out = System.out;
		int x, y, z, m, n, l;
		x = 2;
		y = 5;
		z = 4;
		n = 5 % 4;
		m = y - x;
		l = 6;
		out.println(n);
		out.println(x);
		out.println(m);
		out.println(z);
		out.println(y);
		out.println(l);
		out.println("x + y + z = " + x + y + z);
		out.println(x + y + z);
	}
}
