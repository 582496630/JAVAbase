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
	}

}
