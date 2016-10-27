package test.oob.equals;

import test.oob.jicheng.Human;

public class Police extends Human{

	private String name;
	private Integer age;
	private String  id;
	
	

public void police(){
	System.out.println("我是警察，我会抓贼");
}

	//生成构造函数
	
	public Police() {
		super();
	}
	public Police(String name, Integer age, String id) {
		super();
		this.name = name;
		this.age = age;
		this.id = id;
	}

	
	
//GET
	
	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}


//对比equals 与    =      定义equals 的方法
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((age == null) ? 0 : age.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}



	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof Police)) {
			return false;
		}
		Police other = (Police) obj;
		if (age == null) {
			if (other.age != null) {
				return false;
			}
		} else if (!age.equals(other.age)) {
			return false;
		}
		if (id == null) {
			if (other.id != null) {
				return false;
			}
		} else if (!id.equals(other.id)) {
			return false;
		}
		if (name == null) {
			if (other.name != null) {
				return false;
			}
		} else if (!name.equals(other.name)) {
			return false;
		}
		return true;
	}


	//toString

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Police [name=" + name + ", id=" + id +", age=" + age + "]";
	}
	
	
/*	public static void main(String[] args) {
		Worker worker = new Worker("ID-123456","zhangsan",36,"Worker","China");
		System.out.println(worker);
		
	}	*/
	
	
	
	
	public static void main(String[] args) {
	Police police1 = new Police("zhangsan",36,"ID-123456" );
	Police police2 = new Police("zhangsan",36,"ID-123456");
	Police police3 = new Police("zhangsan",36,"ID-123456");
	Police police4;
	
	if (police1 == police2) {
		System.out.println("police1 == police2 :" + (police1 == police2));

	} else {
		System.out.println("police1 != police2 :" + (police1 != police2));
		System.out.println("police1 : " + police1);
		System.out.println("police2 : " + police2);

	}
	if (police1.equals(police2)) {
		System.out.println("police1.equals(police2) :" + (police1.equals(police2)));
	} else {
		System.out.println(" !police1.equals(police2) :" + (!police1.equals(police2)));
	}
	
	
	if (police1.equals(police3)) {
		System.out.println("police1.equals(police3) :" + (police1.equals(police3)));
	} else {
		System.out.println(" !police1.equals(police3) :" + (!police1.equals(police3)));
	}
	
	
	police4 = police3;
	System.out.println("police3 : " + police3);
	System.out.println("police4 : " + police4);
	police4.setId("ID--36987");
	police4.setAge(25);
	System.out.println("修改了 police4 的ID属性: ");
	System.out.println("police3 : " + police3);
	System.out.println("police4 : " + police4);
	
	
	police4.equals(police2);
	System.out.println("equals");
	System.out.println("police2 : " + police2);
	System.out.println("police4 : " + police4);
	police4.setId("ID--3337777");
	police4.setAge(28);
	System.out.println("修改了 police4 的ID属性: ");
	System.out.println("police2 : " + police2);
	System.out.println("police4 : " + police4);
}

}
