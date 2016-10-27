package test1;

public class T1 {

	public static void main(String[] args) {

          int x;
          x= Integer.parseInt(args[0]);    //String 转 int;s
          
		
		//int x=7;
		
		
		for (int i = 0; i < x; i++) {
			for (int j = 0; j < i+1; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < 2 * (x-i)-1; j++) {
				
				
				System.out.print("*");
			}

			System.out.println();
			
			
		}
	}

}
