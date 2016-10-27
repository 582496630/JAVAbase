package test.oob.chouxianglei;

import lombok.Getter;
import lombok.Setter;

public class MPhone extends Phone {
	@Getter@Setter
	static String vender="魅族";
     
	@Override
	public void startOs() {

		System.out.println("我是魅族          "+"我是Iphoe2，我的父类是Phone2，我代替Phone2来实现Phone的startOs方法");
		System.out.println("调用Phone类的os属性      "+"我是魅族,我的系统是  "+this.getOs());//this 是调用当前类的属性
		System.out.println("调用Phone类的os属性      "+"我是魅族,我的系统是  "+super.getOs());//super  是调用父类的属性
		//this super 是调用对象层次的
		

		System.out.println("测试Static的属性 Vender     "+"我的生产商是：   "+MPhone.getVender());
		//因为vender是static的，已经提升到类层次，用这个方法引用，以自己类中的vender为主
		System.out.println("测试Static的属性 Vender      "+"我的生产商是：   "+Phone.getVender());//因为vender是static的，已经提升到类层次，用这个方法引用
		
	}

}
