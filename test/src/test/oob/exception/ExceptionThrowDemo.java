package test.oob.exception;

public class ExceptionThrowDemo {

	
	
	public static void fangfa1(int x) throws Exception{
		
		if (x<0) {
			throw new ExceptionThrowDemo2();
		}
		
		if (x<10) {
			throw new Exception();
		}
		
		System.out.println("抛出异常的if判断方法语句");
	}
	
	
/*当x<0   执行	ExceptionThrowDemo2类的抛出
当0<x<10  执行Exception的抛出*/
	
	public static void main(String[] args) {
		
		System.out.println("抛出执行开始");
		try {
			ExceptionThrowDemo.fangfa1(-3);
		} catch (ExceptionThrowDemo2 e) {
			e.printStackTrace();
			System.out.println("ExceptionThrowDemo2 的  catch 语句块");
		}catch (Exception e) {
		e.printStackTrace(); 
		System.out.println("Exception 的  catch 语句块");
	}

        System.out.println("抛出执行结束");
		
		
	}

}
