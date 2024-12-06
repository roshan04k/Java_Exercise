package program.code;

import java.util.Arrays;
import java.util.List;

public class LamdaIterate {

	public static void main(String[] args) {
		
		List<String> name = Arrays.asList("Java","JS","Python","React");
		
		name.forEach(data->System.out.println(data));
	}

}
