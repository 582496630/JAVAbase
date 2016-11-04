package collection;

import java.io.PrintStream;
import java.util.HashMap;

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

		treeMap.putAll(tMap);
		out.println(treeMap.size());
		out.println("treeMap:  " + treeMap);

		out.println(treeMap.entrySet());
		
		out.println(treeMap.ceilingEntry(7l));
		out.println(treeMap.ceilingKey(8l));
		out.println(treeMap.comparator());
		out.println();
		
	}

}
