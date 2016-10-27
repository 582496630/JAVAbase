package test.oob.jiekou;

public class TPhone implements Iinterface1 {

	@Override
	public void startOS(){

		System.out.println("我是TPhone   我正在实现Iinterface1接口的startOS方法");
	}

	@Override
	public void run(){

		System.out.println("我是TPhone   我正在实现Iinterface1接口的run方法");
		
		
	}

	public static void main(String[] args) {

		Iinterface1 ceshi1 = new TPhone();
		ceshi1.startOS();
		ceshi1.run();
		
		
	}

}
