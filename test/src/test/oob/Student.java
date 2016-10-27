package test.oob;


//构造方法

class Teacher {
	Integer age;
	String name;

	Boolean sex;

	//构造方法 Teacher.age
	public Teacher(Integer age,String name) {
		super();
		this.age = age;
        this.name=name;
		System.out.println("构造函数    age=   " + age);
		System.out.println("构造函数    name=   " + name);
	}

	//普通方法
	public   String toood() {
		String toood = ("name=" + name+"    age=  "+age);
		return toood;
		
		
	}

	//默认构造方法    
	public Teacher() {
		super();
	}

}

public class Student {
	public static void main(String[] args) {

		 Teacher teacher = new Teacher(30,"zhouyou");//构造函数赋值
		 
		 teacher.age=11;
		 teacher.name="zhouyou";
		 System.out.println(teacher.toood());
		
	}

}
