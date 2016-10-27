package chengfakoujue;

public class XiangJia {
     public static void main(String[] args) {
    	 int all=0;
    	 for (int i = 0; i <= 100; i++) {
    		all=all+i;
		}
    	 System.out.println("1+...+100 = "+all);
		
    	 //加法口诀表
    	 System.out.println();
    	 System.out.println("加法口诀表:");
    	 for(int x=1;x<10;x++){
    		 for(int y=1;y<=x;y++){
    			 System.out.print(y+ "+"+x+"="+(x+y)+"\t");
    		 }
    		 System.out.println();
    	 }
	}
}
