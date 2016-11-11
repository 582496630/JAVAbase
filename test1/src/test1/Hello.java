
package test1;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Hello {

	public static void main(String[] args) {


		Pattern p = Pattern.compile("[(\\d+)]");
		 //Matcher m = p.matcher("[1][2][2][3][5][6][7][8][9][10]");
		 Matcher m = p.matcher("100#168#1000");
		 
		 List<String> list1 = new ArrayList<String>();
		 while(m.find()){
		 //System.out.println(m.group());
			 
			 
		 list1.add(m.group());
		 }
		 
		 //String[] a = new String[list1 .size()];
		System.out.println(list1);
		
	}
}