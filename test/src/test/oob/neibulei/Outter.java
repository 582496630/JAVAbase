package test.oob.neibulei;

public class Outter {


	private Inner inner;// 用来保存Inner类的一个实例化对象--个体,声明inner 是内部类的
	
	String name ="Outter";
	
	String id="123456";
	
	public void print(){
		System.out.println("我是---Outter");
		
	}
	
	public Inner getInnerInstance(){
		if (inner==null) {
			inner=new Inner();
		}
		return inner;
	}
	public void readInnerName(){
		//String tmpName= inner.name;
		String tmpName = getInnerInstance().name;    //调用内部类的name属性
		System.out.println("我是Outter类  ，我可以访问内部类的名字：" + tmpName);
	}
	public void execInnerPrint() {
		System.out.println("我是外部类，我将要执行内部累类的方法：");
		getInnerInstance().print();          //调用内部类的print属性
		System.out.println("我是外部类，我执行内部类的方法结束了！");
	}
	
	class Inner{
		String name = "Inner";
		
		public  void print(){
			System.out.println("我是---Inner");
		}
		
		public void readOutterName(){
			
			//Outter.this.name  Outter.this.id   调用外部类的name  id  方法
			System.out.println("这是内部类的方法，我自己的内部类的名字是：" + name + " 我的外部类的名字是：" + Outter.this.name+"我外部类的ID是：  "+Outter.this.id);
		}
		public void execOutterPrint() {
			System.out.println("我是内部类，我将要执行外部类的print方法-----------");
			Outter.this.print();     //调用外部类的print方法
			System.out.println("我是内部类，我将要执行外部类的print方法结束-----------");
		}
		
	}
	

		
		public static void main(String[] args) {
			Outter outter = new Outter();// 建立外部类对象，为了建立内部类的对象，内部类对象是依赖外部类对象建立的
			outter.print();// 外部类的打印方法
			outter.readInnerName();//输出值调用了  内部类的name
			outter.execInnerPrint();
			
System.out.println();

			Outter.Inner inner2 = outter.new Inner();//建立内部类对象
			//Outter.Inner inner2 = outter.getInnerInstance();//建立内部类对象    第二种方式
			inner2.print();// 内部类print方法
			inner2.readOutterName();
			inner2.execOutterPrint();

		
	}
	
}
