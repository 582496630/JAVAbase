package exam3;

import java.awt.List;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class ExamTest {
	
	public void  mathTest() throws Exception{
		int x,y=0;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("x范围内的整数相加，X为： ");
		x= scanner.nextInt();
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = 1; i <=x; i++) {
			y=y+i;
			list.add(i);
		}
		System.out.println("总数y: "+y);
		System.out.println("数组集合: "+list.toString());
		
		File file = new File("D:\\Exam3.txt");
		FileWriter fw = new FileWriter(file);
		
		String str = "求X范围内的整数相加的和 "+"\r\n输入的范围X为： "+x
				+"\r\n相加之和y为： "+y+"\r\n这些数分别是："+list.toString();
		
		fw.write(str);
		System.out.println("写入成功");
		fw.close();
		
		
	}
	

}
