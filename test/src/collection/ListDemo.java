package collection;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListDemo {

	public static void main(String[] args) {

		List<String>  strlist= new ArrayList<String>();
		List<String> strlist2=new ArrayList<String>();
		PrintStream out=System.out;
		//add size用法
		strlist.add("11");
		strlist.add("11");
		strlist.add("22");
		strlist.add("33");
		strlist.add("44");
		strlist.add("55");
		strlist.add("55");
		out.println("集合长度： "+strlist.size()+"\n"+"集合内容："+strlist.toString());
		
		//在指定的地方（索引、指针）插入一个值
		strlist.add(5, "66");
		out.println(strlist.toString());
		//contains 用法
		out.println("contains检测集合是否包含2：");
		out.println(strlist.contains("2"));
		
		//equal  比较指定的另一个对象与现在的这个是否相等
		out.println("equal 用法1：");
		out.println(strlist.equals(strlist2));
		//get 用法
		out.println("get 用法：");
		out.println("集合第三位数值是："+strlist.get(3));
		//hashCode
		out.println("hashCode值:");
		out.println(strlist.hashCode());
	//isEmpty 
		out.println("集合是否为空：");
		out.println(strlist.isEmpty());
		
		//indexOf 不在集合内输出-1，在的话就输出指针数
		out.println("indexOf 不在集合内输出-1，在的话就输出指针数");
		out.println(strlist.indexOf("11"));
		out.println(strlist.indexOf("22"));
		out.println(strlist.indexOf("44"));
		out.println(strlist.indexOf("55"));
		out.println(strlist.indexOf("88"));
		
		//set 用法  指定集合内某一个位置的数修改
		out.println("修改第4位为3333:  ");
		strlist.set(3,"3333");
		out.println(strlist.toString());
		
		
		//iterator 迭代
		out.println("iterator 迭代 :");
		Iterator<String> iterator = strlist.iterator();
		while (iterator.hasNext()) {
			String string = (String) iterator.next();
			out.println(string);
		}
		out.println("strlist内容："+strlist);
		
		
		// toArray 用法
		out.println("toArray 输出:");
		String y[]=strlist.toArray(new String[2]);
		for (String string : y) {
			out.println(string);
		}
		
		
		out.println("clear 之后:");
		strlist.clear();
		out.println("strlist内容："+strlist);
		
		
		out.println("equal 用法2：");
		out.println(strlist.equals(strlist2));
	}

}
