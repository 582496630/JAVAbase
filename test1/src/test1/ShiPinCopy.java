package test1;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import sun.print.resources.serviceui;

public class ShiPinCopy {

	public static void main(String[] args) throws IOException {

		File file = new File("F:\\JAVA\\Vedeo.zip");
		File file2 = new File("F:\\Vedeo_copy2.zip");
		
		InputStream in = new FileInputStream(file);
		BufferedInputStream bInputStream = new BufferedInputStream(in);

		OutputStream outputStream = new FileOutputStream(file2);
		BufferedOutputStream bOutputStream = new BufferedOutputStream(outputStream);

		byte[] b = new byte[300];
		int tmp;
		while ((tmp = bInputStream.read(b)) != -1) {

			bOutputStream.write(b, 0, tmp);

		}
		bInputStream.close();
		bOutputStream.close();

		System.out.println("复制成功");
	}

}
