package test1;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;

public class TxtCopy {

	public static void main(String[] args) throws IOException {


		File file = new File("D:\\test\\text.txt");
		File file2 = new File("f:\\text.txt");
		InputStream  ins = new FileInputStream(file);
Reader in = new InputStreamReader(ins, "GBK");
        BufferedReader bReader = new BufferedReader(in);
		
		Writer out=new FileWriter(file2);
		BufferedWriter bWriter = new BufferedWriter(out);
		
		String str = bReader.readLine();
		
		
		while (str!=null) {
			
			bWriter.write(str);
			bWriter.newLine();
			str = bReader.readLine();
			
		}
		
		bReader.close();
		bWriter.close();
		System.out.println("复制成功");
		
		
	}

}
