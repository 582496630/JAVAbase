package exam2;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ExamOut2 extends Thread{

	public static void main(String[] args) {

		
		
		ExamOut2 run2=new ExamOut2();
		run2.start();
	}
@Override
	public void run(){
		
		Class class1 = Exam2.class;
		
	try{
				Object o = class1.newInstance();
				Method method = class1.getMethod("zhengchu");
				method.invoke(o);
	}catch (Exception e) {
		System.out.println("输入的值出现异常");
		e.printStackTrace();
	}
		
	}
	
	
}
