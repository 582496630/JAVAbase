package Arrary;

import java.io.PrintStream;
import java.util.Arrays;

public class ArrayMaxMin {

	public static void main(String[] args) {

		int shuzu[];
		shuzu=new int[4];
		shuzu[2]=44;
		
		
		
		
		PrintStream out =System.out;
		//求数组的最大值、最小值
		int array[]={25,51,6,89,7,5,96,45,35,12};
		int m,n;
		m=array[0];
		n=array[0];
		for (int i = 1; i < array.length; i++) {
			if(m<array[i]){
				m=array[i];
			}else if(n>array[i]){
				n=array[i];
			}
		}
		out.println("最大值："+m);
		out.println("最小值："+n);
		out.println();
		
		
		//数组排序
		Arrays.sort(array);
		out.println("排序后的数组：");
		for (int i : array) {
			out.println(i);
		}
		
		//数组copy
		int arraycopy[];
		arraycopy=new int [5];
		System.arraycopy(array, 2, arraycopy, 1, 3);

		out.println();
		out.println("arraycopy:");
		for (int i : arraycopy) {
			out.println(i);
			
		}
	}

}
