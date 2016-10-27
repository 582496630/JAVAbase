package test;
import java.io.PrintStream;

public class Mujin2 {

	public static void main(String[] args) {
		PrintStream out = System.out;
		out.println("Hello World");
		out.println("你是谁" + args[0] + "你多大？" + args[1]);
		out.println(args[2]);
	}

}
