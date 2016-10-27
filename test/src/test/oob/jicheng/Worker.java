package test.oob.jicheng;

import lombok.Getter;
import lombok.Setter;

@Getter@Setter
public class Worker extends Human {
	Integer age;
	String  name;
	
	String courty;
	
	
	 public void work(){
		 
		 System.out.println(" woker 你好  ");
		 
	 }

		public void work2(Integer age,String  name) {
			
			System.out.println("work2 age==  "+age+"   work name=   "+name);
			
		}
		
		public Worker() {
			super();
			
		}

		public Worker(Integer age, String name, String courty) {
/*			super(12,"zhouyou","chain");
			this.age = age;
			this.name = name;
			this.courty = courty;*/
			
			super(age,name,courty);
			this.age = age;
			this.name = name;
			this.courty = courty;
		}
	 

		/* (non-Javadoc)
		 * @see java.lang.Object#toString()
		 */
		@Override
		public String toString() {
			return "Worker [age=" + age + ", name=" + name + ", courty=" + courty + "]";
		}

		
	public static void main(String []args){
		Worker workeroo=new Worker(20,"zy","ch");
		
		System.out.println(workeroo);
		
		System.out.println();
		
	}





}
