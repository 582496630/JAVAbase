package reflect;

import java.lang.reflect.Field;

import test.oob.jicheng.Human;

public class ReflectDemo2 {

	public static void main(String[] args) throws Exception, SecurityException {

		Class<?> demo1;
		Class<?> demo2;
		Class<?> demo3;
		
		demo1 = Class.forName("reflect.ReflectDemo2");
		demo2 = new ReflectDemo2().getClass();
		demo3 = ReflectDemo2.class;
		
		Object ref = demo2.newInstance();
		
		
		
		
		System.out.println(ref.getClass());
		System.out.println(ref.toString());
		System.out.println(demo1.getName());
		System.out.println(demo2.getName());
		System.out.println(demo3.getName());
		
		
		
		
		
	}

}
