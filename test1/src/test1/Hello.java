
package test1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

import com.sun.java.swing.plaf.windows.resources.windows_fr;

public class Hello {

	public static void main(String[] args) throws Exception {

		File file = new File("D:\\TEst1.txt");
/*	//	FileWriter fw = new FileWriter(file);
		
		String str = "输入到文件里";
		System.setOut(fw.write(str));
				
				OutputStream out2 = new FileOutputStream(file);
		Writer writer = new OutputStreamWriter(out2, "GBK");
		//PrintStream out =writer;
		System.setOut();
		
		System.setOut(System.out);
		PrintStream out = System.out;
	     out.println("输入到文件里");*/
		
		FileOutputStream outputStream = new FileOutputStream(file);
		PrintStream stream = new PrintStream(outputStream);
		stream.println("把程序结果直接输入进文件");
		
		
	}
}