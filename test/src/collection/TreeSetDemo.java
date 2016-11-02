package collection;

import java.io.PrintStream;
import java.util.TreeSet;

import test.oob.jicheng.Human;

public class TreeSetDemo {

	public static void main(String[] args) {
PrintStream out =System.out;
		
		TreeSet<Human> tSet = new TreeSet<Human>();
		
		tSet.add(new Human("ID--01", 12));
		tSet.add(new Human("ID--02", 13));
		tSet.add(new Human("ID--03", 14));
		tSet.add(new Human("ID--04", 15));
		tSet.add(new Human("ID--05", 16));
		tSet.add(new Human("ID--06", 17));
		tSet.add(new Human("ID--07", 18));
		
	out.println(tSet);
		out.println(tSet.first());
		out.println();
		
		
		for (Human human : tSet) {
			out.println(human);
		}
		
		out.println();
		Human human1 = new Human("ID--08",10);
		tSet.ceiling(human1);
		out.println(tSet.ceiling(human1));
		
		Human human2 = new Human("ID--05",14);
		out.println(tSet.ceiling(human2));
		
		out.println(tSet.first());
		out.println(tSet.floor(human2));
		out.println(tSet.floor(human1));
		
		out.println();
		out.println(tSet.headSet(human2));
		out.println(tSet.tailSet(human2));
		out.println();
		out.println();
		out.println();
		out.println();
		
		TreeSet<Human> tSet2 = (TreeSet<Human>) tSet.clone();
		
		out.println(tSet);
		out.println(tSet2);
		
		for (Human human : tSet2) {
			
			human.setAge(250);
		}
		out.println();
		out.println(tSet);
		out.println(tSet2);
		
		
	}

}
