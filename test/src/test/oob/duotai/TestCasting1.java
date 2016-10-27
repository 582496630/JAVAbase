package test.oob.duotai;

import test.oob.Static.Farmer;
import test.oob.equals.Police;
import test.oob.jicheng.Star;
import test.oob.jicheng.Worker;

public class TestCasting1 {



	//向上转型    子类代父类      
	public static void main(String[] args) {

		Worker worke = new Worker(30,"zy","ch");
		Star star = new Star();
		Police police = new Police();
		Farmer farmer = new Farmer();
		
		worke.work2(123,"zhouyou");
		star.sing();
		police.police();
		farmer.farm();
		
		
		System.out.println("Worker 声明的参数类跟Human不一样，以自己的为主      "+worke);
		System.out.println("Star 没有声明参数            "+star);
		System.out.println("Police 声明的参数跟Human不一样，以自己的为主         "+police);
		System.out.println("Farmer 没有toString   "+farmer);
		
		
	}

}
