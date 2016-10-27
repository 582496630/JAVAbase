package test.oob.fengzhuang;


public class Student2 {

	public static void main(String[] args) {

		
		Teacher2 teacher= new Teacher2();
		teacher.setAge(-30);
		teacher.setCourse("JAVA");
		teacher.setName("zhouyou");
		teacher.setIsman(true);
		
		System.out.println(teacher.toString());
		
	}

}
