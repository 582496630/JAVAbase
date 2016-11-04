package collection;

import java.io.PrintStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import test.oob.neibulei.Outter;

public class HushMap {

	public static void main(String[] args) {
		PrintStream out = System.out;
		// 声明hMap cMap
		Map<Long, Integer> hMap = new HashMap<Long, Integer>();
		Map<Long, Integer> cMap = new HashMap<Long, Integer>();

		// put 用法
		cMap.put(5l, 500);
		cMap.put(6l, 600);
		cMap.put(7l, 700);
		cMap.put(8l, 800);
		cMap.put(9l, 900);

		hMap.put(1L, 100);
		hMap.putAll(cMap);

		out.println("hmap : " + hMap);

		// Map.Entry<k.v> 用法
		Set<Map.Entry<Long, Integer>> setmap = hMap.entrySet();
		for (Entry<Long, Integer> entry : setmap) {
			out.println(entry);
			// out.println(entry.getValue()+" = "+entry.getValue());
		}

		// keyset 用法
		out.println("keyset 用法:  " + hMap.keySet());
		for (Long hLong : hMap.keySet()) {
			out.println(hLong);
		}

		// valus 方法
		out.println("valus 方法");
		out.println(hMap.values());
		for (Integer hInteger : hMap.values()) {
			out.println(hInteger);
		}
		// containskey + containsvalues
		out.println("containskey + containsvalues");
		out.println("" + hMap.containsKey(10l));
		out.println("" + hMap.containsValue(800));

		// get 用法
		out.println("get 用法");
		out.println(hMap.get(6l));
		out.println(hMap.get(6));

		// replace 用法，代替以前键值的值
		out.println("replace 用法，代替以前键值的值");
		hMap.replace(1l, 222);
		out.println(hMap);
		out.println("key =1 对应的键值: " + hMap.get(1l));

		// remove 用法
		out.println("remove 用法，移除k=7，对应的值：");
		hMap.remove(7L);
		out.println(hMap);

		
		//put 用法
		out.println("put 用法，把5 对应的值改为555:");
		hMap.put(5l, 555);
		out.println(hMap);
		
		// clear 用法
		hMap.clear();
		out.println("clear 用法,使用后集合为空");
		out.println(hMap);

	}

}
