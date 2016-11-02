package weekenum;

import lombok.Getter;
import lombok.Setter;

public enum WeekEnum2 {
	

	error1(1,"intenet break"),error2(2,"vpn don't connection"),error3(3,"operating error "),
	error4(4,"restart client");
	
	
	@Getter@Setter
	private Integer index;
	//content 内容
	@Getter@Setter
	private String content;
	

	private WeekEnum2(String content) {
		this.content = content;
	}
	
	private WeekEnum2(Integer index,String content){
		this.index=index;
		this.content=content;
		
	}
	
	
	
	
	

}
