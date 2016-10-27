package test1;

import java.io.PrintStream;

public class Test1 {

	public static void main(String[] args) {
		PrintStream out = System.out;

		int x = Integer.valueOf(args[0]);
		int y = Integer.parseInt(args[1]);

		out.println("x = " + x);
		out.println("y = " + y);
		out.println();

		// if
		out.println("if 分支");
		if (x > 5) {
			out.println("if 分支    x = " + x);
		}
		out.println("if 分支    条件不满足     ");

		// if else
		out.println();
		out.println("if else 分支");
		if (y > 3) {
			out.println("y>3 y = " + y);

		} else {
			out.println("y>3 else x = " + x);
		}

		// if else if else
		out.println();
		out.println("if else  if else 分支");

		if (y > 6) {
			out.println("y>6 y = " + y);
		} else if (x > 3) {
			out.println("x>3 x = " + x);
		} else if (x < 3) {
			out.println("x<3 x = " + x);

		}

		// switch
		out.println();
		out.println("switch 分支");
		switch (x) {
		case 1:
			out.println("case 1:x = " + x);
			break;
		case 2:
			out.println("case 2:x = " + x);
			break;

		default:
			out.println("default :x = " + x);

			break;
		}
		// ?x:y
		out.println();
		out.println("?x:y 分支");
		int m = (x > y) ? 7 : 9;
		out.println("?x:y 分支   m = " + m);

	}

}
