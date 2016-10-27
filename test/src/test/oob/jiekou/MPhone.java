package test.oob.jiekou;

public class MPhone implements Iinterface1 {

	@Override
	public void startOS() {
		// TODO Auto-generated method stub

	}

	@Override
	public void run() {
		System.out.println("我是MPhone   我正在实现Iinterface1接口的run方法");
	}

	public static void main(String[] args) {

		
		Iinterface1 ceshi2 = new MPhone();
		ceshi2.startOS();
		ceshi2.run();
		
	}

}
