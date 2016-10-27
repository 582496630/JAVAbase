package test.oob.jicheng;

public class TestO0d {

	// 继承 测试
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Worker worker = new Worker(21,"ZHUY","CHOO");
		System.out.println(worker);
		
		Worker worker3 = new Worker();
		
		worker3.work();
		
		
		Star sing = new Star();
		sing.sing();
		sing.age = 20;
		sing.name = "ZHOUYOU";
		sing.id = "1234";
		System.out.println(sing);

	}

}
