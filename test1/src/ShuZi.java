import java.io.PrintStream;

public class ShuZi {

	public static void main(String[] args) {
      int x=1,y=2,z=3;
      PrintStream out = System.out;
      out.println(x+y+z);
      out.println(x);
      out.println("你是谁？"+args[0]+"   你叫什么?"+args[1]);
      out.println("你好吗？"+x);	  
	}
}
