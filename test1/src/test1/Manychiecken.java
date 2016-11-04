package test1;

public class Manychiecken {

	public static void main(String[] args) {

		int z;// 定义小鸡变量
		int m, n;
		m = Integer.parseInt(args[0]);// 输入花费 的总金额
		n = Integer.parseInt(args[1]);// 输入买入鸡的总数
		// x 公雞數量 y 母雞數量
		for (int x = 0; x < m / 5; x++) {
			for (int y = 0; y < m / 3; y++) {
				z = n - x - y;
				if (5 * x + 3 * y + z / 3 == m && z % 3 == 0) {
					System.out.println("公鸡数量： " + x + "  母鸡数量" + y + "  小鸡数量：" + z);
				}
			}
		}
		System.out.println("花费的总金额：" + m + "  买入鸡的总数" + n);
	}

}
