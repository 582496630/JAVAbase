package test.oob.chouxianglei;

public class IPhone extends Phone {

	@Override
	public void startOs() {

		System.out.println("我是Iphoe     "+"我的父类是Phone，我代替Phone来实现Phone的startOs方法");
		
		

    }
}