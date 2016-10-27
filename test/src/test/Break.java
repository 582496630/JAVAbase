package test;

import java.io.PrintStream;

public class Break {

	public static void main(String[] args) {

		PrintStream out = System.out;
		// int x= Integer.valueOf(args[0]);
		// int y= Integer.valueOf(args[1]);
		int x = 4;
		int y = 7;
int m=4;
		out.println("x = " + x);
		out.println("y = " + y);
		out.println();
		for (int i = 0; i < x; i++) {
			for (int j = 1; j < y; j++) {
if (j==m) {
	
	out.print("*");
} else if(j==m-x){
	out.print(" ");

}

			}
			out.println("*");
		}

	}

}
