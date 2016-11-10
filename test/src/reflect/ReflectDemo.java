package reflect;

import java.lang.reflect.Field;

import test.oob.jicheng.Human;

public class ReflectDemo {

	public static void main(String[] args) throws Exception, SecurityException {

		Class c1=Human.class;
		
		Field fid=c1.getDeclaredField("id");
		Object o = c1.newInstance();
		
		fid.setAccessible(true);
		
		fid.set(o,"100");
		
		System.out.println(fid.get(o));
		
	}

}
