package test.oob.exception;

public class ExceptionDemo5 {
	

	
	//抛出系统异常：Exception
	public static void throwException1(int x) throws Exception{
		
		if (x==2) {
			throw new MyExceptionSleep();
		}
		System.out.println("抛出异常方法");
	}
	
	public static void throwException2(int x) throws Exception{
		
		if (x==3) {
			throw new Exception();
		}
		System.out.println("抛出异常语句 2");
	}
	

	public static void main(String[] args)  {

		
/*		System.out.println("输出异常之前2");
		try {
			
			ExceptionDemo5.throwException2(2);
		} catch (Exception e) {
            e.printStackTrace();
            System.out.println("输出异常2");
		 
		}
		
		System.out.println("输出异常之后2");
		*/
		
		System.out.println("输出异常之前");
		try {
			
			//ExceptionDemo5.throwException1(2);
			ExceptionDemo5.throwException2(3);
			
			//MyExceptionSleep 是Exception的子类，子类可以代替父类的使用，所以Exception的范围更大，
			//其catch语句块只能放在MyExceptionSleep的catch语句前面
		} catch (MyExceptionSleep e) {
			e.printStackTrace();
			System.out.println("输出异常MyExceptionSleep : "+e.getClass().getName());
		}catch (Exception e){
			e.printStackTrace();
			System.out.println("输出异常Exception : "+e.getClass().getName());
			
		}
		
		
		
		System.out.println("输出异常之后");
		
		
	}

}
