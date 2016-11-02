package weekenum;

import java.io.PrintStream;

public class TestEnum {
	public static void  tenum(WeekEnum enum1){
		PrintStream out=System.out;
		
		switch (enum1) {
		case 春天:
			out.println("春天");
			break;
		case 夏天:
			out.println("夏天");
			break;
		case 秋天:
			out.println("秋天");
			break;
		case 冬天:
			out.println("冬天");
			break;

		case sijitian:
			out.println();
			out.println("四季天");
			out.println(enum1.sijitian);
			break;
		case wuyuehua:
			out.println("五月花");
			break;
		case liuyueyu:
			out.println("六月雨");
			break;
		default:
			out.println("七月桥");
			break;
		}
	}
	
	public static void tenum2(WeekEnum2 enum2){
		PrintStream out = System.out;
		switch (enum2) {
		case error1:
			out.println(enum2.getIndex()+":"+enum2.getContent());
			break;
		case error2:
			out.println();
			out.println(enum2.getIndex()+":"+enum2.getContent());
			break;
			
		case error3:
			out.println();
			out.println(enum2.getIndex()+":"+enum2.getContent());
			break;

		default:
			out.println();
			out.println(enum2.getIndex()+":"+enum2.getContent());
			break;
		}
		
		
		
	}
	
	

	public static void main(String[] args) {

		tenum(WeekEnum.春天);
		tenum(WeekEnum.夏天);
		tenum(WeekEnum.秋天);
		tenum(WeekEnum.冬天);
		tenum(WeekEnum.sijitian);
		tenum(WeekEnum.wuyuehua);
		tenum(WeekEnum.liuyueyu);
		tenum(WeekEnum.qiyueqiao);
	
		System.out.println();
		
		tenum2(WeekEnum2.error1);
		tenum2(WeekEnum2.error2);
		tenum2(WeekEnum2.error3);
		tenum2(WeekEnum2.error4);
		
		
		
	}

}
