package collection;

import java.io.PrintStream;
import java.util.HashSet;
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
		// Set两种toArray 的用法
		out.println("Set两种toArray 的用法 比较");
		for (Integer integer : intset) {
			out.println(integer);
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
		
		//out.println(intset.stream());
	 
	out.println( intset.iterator());
	 
	}

}
