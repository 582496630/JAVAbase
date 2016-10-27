package test.oob.jiekou;

public class TestInterface3Impl implements Iinterface3 {

	@Override
	public void startOS() {
		System.out.println("我是实现类    TestInterface3Impl   我正在实现Iinterface1接口的startOS方法");

	}

	@Override
	public void run() {

		System.out.println("我是实现类    TestInterface3Impl   我正在实现Iinterface1接口的run方法");
	}

	@Override
	public void book() {

		System.out.println("我是实现类    TestInterface3Impl   我正在实现Iinterface2接口的book方法");
	}

	@Override
	public void eat() {

		System.out.println("我是实现类    TestInterface3Impl   我正在实现Iinterface3接口的eat方法");
	}

	public static void main(String[] args) {

		System.out.println("接口的耦合性，在不影响实现类TestInterface 的程度上，输出自己的实现方法，并超过");
		System.out.println();

		TestInterface implold=new TestInterface();
		implold.run();
		implold.startOS();
		implold.book();
		
		

		System.out.println("************************************************");

		System.out.println("我是Iinterface3接口的实现类，我要实现Iinterface1、Iinterfa2、Iinterface3三个接口的方法");

		Iinterface3 impl = new TestInterface3Impl();
		impl.run();
		impl.startOS();
		impl.book();
		impl.eat();

	}

}
