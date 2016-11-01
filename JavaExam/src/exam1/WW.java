package exam1;

public class WW {

	public static void main(String[] args) {
		int i, j;
        for (i = 0; i < 5; i++) {
            int k = i;
            // 判断输出多少空格数
            while (k < 5) {
                System.out.print(" ");
                k++;
            }
 
            for (j = 0; j < 1 + i * 2; j++) {
                // 判断首尾的时候输出*号
                if (j == 0 || i == (5 - 1) || j == (i * 2)) {
                    System.out.print("*");
                } else {
                    // 不满足条件时候输出空格
                    System.out.print(" ");
                }
 
            }
            System.out.println();
 
        }
	}

}
