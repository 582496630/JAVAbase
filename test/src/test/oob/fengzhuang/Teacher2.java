package test.oob.fengzhuang;


//封装

public class Teacher2 {

	private Integer age;
		
	 private String   name;
	 private Boolean  isman;
	 private  String  course;
	 
	 //name
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	//isman
	public Boolean getIsman() {
		return isman;
	}
	public void setIsman(Boolean isman) {
		this.isman = isman;
	}
	
	//course
	 public String  getCourse(){
		 return course;
	 }
	 public void setCourse(String course){
		 this.course = course;
	 }
		
	 
	 //age
	 public Integer  getAge(){
		 return age;
		 
	 }
	 public void setAge(Integer age) {
		 this.age = age;
	 }
	 public Boolean setAge(int age) {
		 if (age>=0) {
			 this.age=age;
			 return true;
		 } else {
			 System.out.println("age输入值无效");
			 return false;
		 }
	 }
	 
	 
	 
/*	 public Teacher2(Integer age, String name, Boolean isman, String course) {
		super();
		this.age = age;
		this.name = name;
		this.isman = isman;
		this.course = course;
		System.out.println("这是Teacher2 四个参数的构造参数");
	}*/
	@Override
		public String toString() {
			return "Teacher2 [age=" + age + ", name=" + name + ", isman=" + isman + ", course=" + course + "]";
		}

		
	

}
