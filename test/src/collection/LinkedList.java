package collection;

import java.io.PrintStream;
import java.util.Iterator;

import test.oob.jicheng.Human;

public class LinkedList {

	public static void main(String[] args) {

		PrintStream out = System.out;

		java.util.LinkedList<Human> lList = new java.util.LinkedList<Human>();
        lList.add(new Human("id--001","xiaowang"));
        lList.add(new Human("id--002","zhang"));
        lList.add(new Human("id--003","zhou"));
        out.println("lList.size() :" + lList.size());
		out.println(lList);
		
		
		Iterator<Human> iterator=lList.iterator();
		
		while (iterator.hasNext()) {
			Human human = (Human) iterator.next();
			out.println(human);
		}
        out.println(lList);
        
        out.println(lList.pop());
        
        Human h = new Human("005","liu");
        
        lList.offer(h);
        out.println(lList);
        
        
	}

}
