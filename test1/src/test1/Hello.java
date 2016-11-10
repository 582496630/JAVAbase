
package test1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Hello {

	public static void main(String[] args) {


		Pattern p = Pattern.compile("[(\\d+)]");
		 Matcher m = p.matcher("[1][2][2][3][5][6][7][8][9][10]");
		 while(m.find()){
		 System.out.println(m.group());
		 }
		
		
	}
}