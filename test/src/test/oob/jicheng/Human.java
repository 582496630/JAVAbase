package test.oob.jicheng;

import lombok.Getter;
import lombok.Setter;

@Setter@Getter   //lombok  根据注解来生成set get
public class Human {
	Integer age;
	String  name;
	String  id;
	
	
	public Human() {
		super();
		System.out.println("这是Human类的无参的构造参数，用于生成Human的一个实例对象");
	}
	Human(Integer age, String name, String id) {
		//super();
		this.age = age;
		this.name = name;
		this.id = id;
		
		System.out.println("这是Human类的3个类的构造参数，用于生成Human的一个实例对象");
	}
    @Override
	public String toString() {
	return "Human [age=" + age + ", name=" + name + ", id=" + id + "]";
	}
	
	
	
	
	
	
	

}
