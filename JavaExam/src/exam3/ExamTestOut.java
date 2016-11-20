package exam3;

import java.lang.reflect.Method;

public class ExamTestOut extends Thread {

	public static void main(String[] args) {

		ExamTestOut wOut = new ExamTestOut();
		wOut.start();

	}

	@Override
	public void run() {

		try {
			Class class1 = Class.forName("exam3.ExamTest");
			Object o = class1.newInstance();

			Method method = class1.getMethod("mathTest");
			method.invoke(o);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("输入的数不对，抛出异常");

		}

	}

}
