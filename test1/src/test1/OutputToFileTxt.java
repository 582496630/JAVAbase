package test1;

import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class OutputToFileTxt {

	public static void main(String[] args) throws Exception {

		
		File file = new File("D:\\outfile.txt");
		FileOutputStream outstream = new FileOutputStream(file);
		
		PrintStream stream = new PrintStream(outstream);
		stream.println("直接输入在文件内！");
		
	}

}
