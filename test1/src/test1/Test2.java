package test1;

import java.io.PrintStream;

public class Test2 {

	public static void main(String[] args) {
		PrintStream out = System.out;
		out.println();

		// for 循环
		out.println("for 循环");
		for (int i = 0; i < 3; i++) {
			out.println("i<3 i =  " + i);
		}
		int all = 0;
		for (int i = 0; i <= 100; i++) {
			all = all + i;
		}
		out.println();
		out.println("all=1+....+100= " + all);

		// while
		out.println();
		out.println("while 循环");
		int x = 7;
		while (x > 3) {
			out.println("x = " + x);
			x--;
		}

		// do while
		out.println();
		out.println("do while 循环");
		do {
			out.println("x = " + x);
			x++;
		} while (x > 8);

		// forreach
		out.println();
		out.println("foreach 循环1");
		int [] shuzu = { 12, 15, 17, 25, 29 };
		for (int i : shuzu) {
			out.println("i = " + i);
		}
			
			out.println();
			out.println("foreach 循环2");
        for (int a =0;a<shuzu.length-1;a++) {
			out.println("a = "+shuzu[a]);
		}
		// for 内嵌
		out.println();
		out.println("for内嵌  循环");
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= i; j++) {
				out.print(j + " * " + i + " = " + i * j + "\t");
			}
			out.println();
		}

	}

}
