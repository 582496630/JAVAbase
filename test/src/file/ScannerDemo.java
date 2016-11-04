package file;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) throws FileNotFoundException {

		PrintStream out=System.out;
		
		
File file = new File("C:\\Users\\Administrator.PC-20160414BMFJ\\Desktop\\java.txt");
		
InputStream in = new FileInputStream(file);

		Scanner scanner = new Scanner(in,"GBK");
		
		while (scanner.hasNextLine()) {
			out.println(scanner.nextLine());
		}
		
		scanner.close();
		
		
	}

}
