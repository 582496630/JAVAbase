package thread;

public class PaperPenOut {

	public static void main(String[] args) {

		Paper paper = new Paper();
		Pen pen = new Pen();
		PaperPenMain war = new PaperPenMain(paper, pen);
		PaperPenMain war2 = new PaperPenMain(paper, pen);
		Thread wanglaowu = new Thread(war2, "wanglaowu");
		Thread zhangsan = new Thread(war, "zhangsan");
		wanglaowu.start();
		zhangsan.start();

	}

}
