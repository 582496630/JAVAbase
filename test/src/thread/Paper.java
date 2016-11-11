package thread;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Paper {

	private String name = "I'm Paper!";
	private String owner;
	private Boolean isPrivated = false;
	
}
