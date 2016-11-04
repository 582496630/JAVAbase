package test.oob.jicheng;

import java.util.Comparator;

import lombok.Getter;
import lombok.Setter;
@Setter@Getter
public class Human implements Comparable<Human>{
  //lombok  根据注解来生成set get
	Integer age;
	String  id;
	String  name;
	
	
	public Human() {
		super();
		System.out.println("这是Human类的无参的构造参数，用于生成Human的一个实例对象");
	}
		public Human(String id, String name) {
			super();
			this.id = id;
			this.name = name;
		}
	Human(Integer age, String name, String id) {
		//super();
		this.age = age;
		this.id = id;
		this.name = name;
		
		System.out.println("这是Human类的3个类的构造参数，用于生成Human的一个实例对象");
	}
    /* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Human [ id=" + id + ", age=" + age+ "]";
	}
	public Human(String id,Integer age) {
		super();
		this.age = age;
		this.id = id;
	}
	
	//比较方法语句   compare
	@Override
	public int compareTo(Human o) {
if (this.age.intValue() == o.age.intValue()) {
	return 0;
} else if (this.age.intValue()>o.age.intValue()) {
	return 1;
}else {
	return -1;
}


	}
	
	


}
		
	
	
	

