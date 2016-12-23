package collection;

import java.io.PrintStream;
import java.util.HashMap;
import java.util.Set;
import java.util.Map.Entry;

public class TreeMap {

	public static void main(String[] args) {
		PrintStream out = System.out;

		java.util.TreeMap<Long, Integer> treeMap = new java.util.TreeMap<Long, Integer>();
		java.util.TreeMap<Long, Integer> tMap = new java.util.TreeMap<Long, Integer>();

		// put 用法
		tMap.put(5l, 500);
		tMap.put(8l, 800);
		tMap.put(6l, 600);
		tMap.put(7l, 700);
		tMap.put(9l, 900);
		//tMap.put(9l, 100);
		tMap.put(10l, 900);
		//TreeMap  中，键值一样，值不一样，输出的后面的键对应的值
        //值一样，键不一样，会输出两个相同值，

		treeMap.putAll(tMap);
		out.println(treeMap.size());
		out.println("treeMap:  " + treeMap);

		out.println(treeMap.entrySet());
		
		out.println(treeMap.ceilingEntry(7l));
		out.println(treeMap.ceilingKey(8l));
		out.println(treeMap.comparator());
		out.println(treeMap.values());
		out.println(treeMap.values());
		
		
	Set<Entry<Long, Integer>> hSet = treeMap.entrySet();
		
		
		for (Entry<Long, Integer> entry :hSet) {
			out.println(entry.getValue());
			out.println(entry.getKey());
			
			
		
	}
	}
}
