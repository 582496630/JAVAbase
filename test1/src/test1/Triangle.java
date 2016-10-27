package test1;

public class Triangle {
	static Integer x = 7;
	public static void test() {
		/*
		 * int[] args; args = new int[10];
		 */
		// Integer x =args[0];

		
		for (int i = 0; i < x; i++) {
			for (int j = 0; j < x - i; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < 2 * i + 1; j++) {
				System.out.print("*");
			}

			System.out.println();
		}

	}
			
	public static void test1(){
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
		
		
		
	

	public static void main(String[] args) {
		System.out.println("1、实心正等腰三角形");
		Triangle.test();
		
		System.out.println();
		System.out.println("2、实心倒立等腰三角形");
		Triangle.test1();

		/*
		 * Triangle triangle = new Triangle(); String sc=Triangle.test();
		 */

	}

}
