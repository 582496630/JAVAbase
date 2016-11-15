package exam2;

import java.lang.reflect.Method;

public class ExamOut extends Thread {

	public static void main(String[] args) throws Exception, Exception {

		
		ExamOut examOut = new ExamOut();

		examOut.start();

	}

	@Override
	public void run() {
		Class<?> class1;
		try {
			class1 = Class.forName("exam2.Exam");// 获得class实例
			Object exam1 = class1.newInstance();// 创建实例
			Method method = class1.getMethod("math");// 得到方法
			method.invoke(exam1);// 唤醒方法

		} catch (Exception e) {
			System.out.println("异常出现了！");
			e.printStackTrace();
		}
	}

}
