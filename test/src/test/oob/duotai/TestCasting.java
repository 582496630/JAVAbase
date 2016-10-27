package test.oob.duotai;

import test.oob.Static.Farmer;
import test.oob.equals.Police;
import test.oob.jicheng.Human;
import test.oob.jicheng.Worker;

//向下转型    兄弟类之间不可以转
public class TestCasting {

	public static void main(String[] args) {

		Human human1 = new Police();//调用无参的构造函数
		Human human2 = new Farmer();//调用无参的构造函数
		Human human3 = new Worker();//调用无参的构造函数

		
		Police police  = (Police) human1;
		
		System.out.println(police);

		Farmer farmer = (Farmer) human2;
		System.out.println("farmer    "+farmer);

		
		
		Worker worker = (Worker) human3;
//Worker worker = (Worker) human2;(错误) 向下转型必须是父子类之间的转，Farmer类跟Worker类是兄弟关系，所以2不能代替3来转型给worker
		System.out.println("worker   "+worker);
		
		
		System.out.println();
		
		//测试Human类中的lombok根据@生成的set有没有生效
	   Human human4 = new Human();
       human4.setId("123");
       System.out.println("测试lombok生成的SET  "+human4);
		
	}

}
