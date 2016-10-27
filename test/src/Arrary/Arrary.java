package Arrary;

import java.io.PrintStream;

public class Arrary {

	public static void main(String[] args) {
		PrintStream out = System.out;

		// 声明不同类型的数组
		int[] intarrary;
		char chararrary[];
		String[] stringarrary;

		// 分配数组内存
		intarrary = new int[4];
		chararrary = new char[4];
		stringarrary = new String[4];

		// 通过foreach 输出数组
		out.println("intarrary:");
		intarrary[3] = 3;
		intarrary[0] = 0;
		intarrary[2] = 2;
		intarrary[1] = 1;
		for (int i : intarrary) {
			out.println(i);
		}
		out.println();
		out.println("chararrary:");
		chararrary[0] = 'a';
		chararrary[1] = 'b';
		chararrary[3] = 'd';
		for (char i : chararrary) {
			out.println(i);
		}
		out.println();
		out.println("stringarrary");
		stringarrary[1] = "abc";
		stringarrary[2] = "abcdef";
		stringarrary[3] = "abcdefghi";
		for (String i : stringarrary) {
			out.println(i);
		}
		
		
	}

}
