package test.oob.jiekou;

public class TestInterface implements Iinterface1, Iinterfa2 {

	@Override
	public void startOS() {
		System.out.println("我是TestInterface   我正在实现Iinterface1接口的startOS方法");
	}

	@Override
	public void run() {
		
		System.out.println("我是TestInterface   我正在实现Iinterface1接口的run方法");
	}

	public void book(){
		
		System.out.println("我是TestInterface   我正在实现Iinterface2接口的book方法");
		
	}
	
	public static void main(String[] args) {

		System.out.println("我是实现类   TestInterface  我要实现Iinterface1、Iinterfa2两个接口的方法");
		System.out.println();

		Iinterface1 impl = new TestInterface();
	    impl.run();	
		impl.startOS();
		
		System.out.println();
		
		Iinterfa2 impl2 = new TestInterface();
		impl2.book();
		
	}

}
