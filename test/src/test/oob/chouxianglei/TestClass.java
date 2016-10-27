package test.oob.chouxianglei;

public class TestClass {

	public static void main(String[] args) {

		Phone iphone = new IPhone();
		iphone.startOs();

		System.out.println();

		Phone mPhone = new MPhone();
		mPhone.startOs();

		System.out.println();

		mPhone.setModel("魅族        我来引用Phone类的 普通方法printlnSelf   ");
		mPhone.printlnSelf();

		System.out.println();
		
		Phone phone2 = new IPhone2();
		phone2.startOs();//Phone 子类是Phone2,Phone2的startOs也是空的抽象方法，所以要靠Phone2的子类IPhone2来实现
		
		System.out.println();
		Phone tPhone = new TPhone();
		
		
	}

}
