package test.oob.Static;

import test.oob.jicheng.Human;


//Static  与    final  


public class Farmer extends Human{

       Integer age = 20;

     
	static  String name1="zhouyou";
	//static  final String name = "zhouyou";


	public static void farm() {

		System.out.println("我是农民");

	}

	/**
	 * @return the name
	 */
	public static String getName1() {
		return name1;
	}

	/**
	 * @param name the name to set
	 */
	public static void setName1(String name1) {
		Farmer.name1 = name1;
	}
	


	/*public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}*/

	public static void main(String[] args) {

		System.out.println(Farmer.name1);
		//System.out.println(Farmer.);   age 不是static  所以不能直接引用

		Farmer.farm();

		Farmer.setName1("shisu");
		System.out.println(Farmer.name1);

	}

}
