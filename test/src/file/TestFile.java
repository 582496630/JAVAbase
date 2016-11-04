package file;

import java.io.File;
import java.io.IOException;

public class TestFile {

	public static void main(String[] args) throws IOException {


		File f=new File("D:\\File\\text\\text.txt");
		File f1=new File("D:\\program files\\MySQL\\MySQL Server 5.7");
		File f2=new File("D:\\program files\\MySQL");
		
		File  P= f.getParentFile();
		
		if (!P.exists()) {
			
			System.out.println(P.mkdirs());
			
		}
		System.out.println(f.createNewFile());
		if (f.exists()) {
			
			f.deleteOnExit();
			System.out.println("f.delete()");
		}
		
		
		
	}

}
