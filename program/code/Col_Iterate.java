package program.code;

import java.util.ArrayList;
public class Col_Iterate {

	public static void main(String[] args) {
		ArrayList<String> arr = new ArrayList<>();
		
		arr.add("JSP");
		arr.add("Thymeleaf");
		arr.add("React");

		for(String name : arr) {
			System.out.println(name);
		}
	}

}
//Iterate using for loop