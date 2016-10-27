package Arrary;

import java.io.PrintStream;
import java.util.Arrays;

public class ArrayChar {

	public static void main(String[] args) {

		PrintStream out = System.out;
		out.println("arraychar 排序");
		char array[]={'a','c','t','y','s','k','i','f','b'};
		Arrays.sort(array);
		for (char c : array) {
			out.println(c);
		}
		
		
		//arraychar copy
		out.println();
		out.println("copy");
		
		char arraycharcopy[];
		arraycharcopy=new char[5];
		System.arraycopy(array, 3, arraycharcopy, 0, 5);
		
		for (char c : arraycharcopy) {
			out.println(c);
			
		}
		
	}

}
