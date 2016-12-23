package collection;

import java.io.PrintStream;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetDemo {

	public static void main(String[] args) {
		
		PrintStream out = System.out;
		
		Set<Integer> intset= new HashSet<Integer>();
		Set<String> strset=new HashSet<String>();
		
		out.println("初始化inset： "+intset);
		
		//Set add方法
		intset.add(5);
		intset.add(6);
		intset.add(7);
		out.println("inset add 5 6 7 : "+intset);
		out.println("inset add 5 6 7 : "+intset.size());
		
		Set<Integer> intset2 = new HashSet<Integer>();
		for (int i = 0; i <= 10; i++) {
			intset2.add(i+10);
		}
		out.println("inset2 通过FOR循环加元素之后: "+intset2);
		
		out.println("inset add 5 6 7 : "+intset);
		intset.addAll(intset2);
		out.println("inset1 以inset2为容器，addall添加元素之后: "+intset);
		
		//Set remove 用法
		intset.remove(5);
		out.println("remove 5 :"+ intset);
		intset.removeAll(intset2);
		out.println("removeAll  intset2 :"+ intset);
		
	/*	out.println("toArray Obejict intset: "+intset.toArray());
		for (Integer integer : intset) {
			out.println(integer);
		}
		Integer[] y = intset.toArray(new Integer[0]);
		for (Integer integer : y) {
			out.println("toArray 容器"+integer);
		}
		*/
		// Set的两种toArray 的用法
	
		out.println("Set两种toArray 的用法 比较");
		Object[] objects=  intset.toArray();
		for (Object object : objects) {
			out.println(object);
		}
		out.println(intset);
		out.println(intset.toArray());
		
		Integer y[]= intset.toArray(new Integer[0]);
		out.println(y);
		out.println(intset.toArray(new Integer[0]));
		for (Integer integer : y) {
			out.println(integer);
		}
		
		//isEmpty 判断集合是否为空
	 out.println("isEmpty: "+intset.isEmpty());
	 intset.add(7);
	 out.println(intset);
	 out.println("equal: "+intset.equals("7"));
		
		//out.println(intset.stream());
	 
	 //包含contains   集合里是否会包含一个数   返回类型为boolean
	 out.println("intset 集合内是不是包含6:   "+intset.contains(6));
	 
	 //iterator  迭代方法  用for 不行，注意是while
	 
	 out.println("迭代   iterator:");
	 Iterator<Integer> iterator = intset.iterator();
	 
	while (iterator.hasNext()) {
		Integer integer = (Integer) iterator.next();
		
		out.println( integer);
	}
	 
	}

}
