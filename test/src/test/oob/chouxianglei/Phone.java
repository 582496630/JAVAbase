package test.oob.chouxianglei;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
public abstract class Phone {
	@Getter@Setter
	private  String  model;
	
	@Getter@Setter
	private  static String  vender="meizu";
	
	@Getter@Setter
	private  String  os="android";
	
	public abstract void startOs();
	
	
	public void  printlnSelf(){
		
		System.out.println("我的型号是：   "+model);
		
		
	}

//构造参数
	public Phone() {
		super();
		
		System.out.println("我是父类构造方法");
	}


}
