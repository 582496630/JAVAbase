package test1;
import java.awt.image.BandCombineOp;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
class Hello2{


	

   
	
	public static void main(String[] args) throws IOException  {


    	
    	File file = new File("D:\\config.txt");
    	
    	Reader in = new FileReader(file);
    	BufferedReader br = new BufferedReader(in);
    char [] cr= new char[(int) file.length()];
    	br.read(cr);
    	
    	String ss= new String(cr);
    	System.out.println(ss);
    br.close();
    	
    	String REGEX = "(\\d+)#";  
        String INPUT = ss;
    	Pattern p = Pattern.compile(REGEX); 
    	
    	
      Matcher m = p.matcher(INPUT);
      while (m.find()) {
		System.out.println(m.group(0));
		
		String x = m.group(0);
	}
      System.out.println(x.toString());
      
      
      
      
      
      
   /*   String[] ii= x.split("#");
      for (String string : ii) {
    	  System.out.println(string);
    	  String[] o= new String[string.length()];

		}*/
    	
    	
	}
}
		
		
		
    
