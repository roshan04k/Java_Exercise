package program.code;

import java.util.*;
public class Col_StudentMangement {

	public static void main(String[] args) {
		ArrayList<Col_Student> students = new ArrayList<>();
		
		students.add(new Col_Student("Roshan","22"));
		students.add(new Col_Student("Vinith","22"));
		students.add(new Col_Student("Siva","23"));
		
		for(Col_Student detail : students) {
			System.out.println(detail);
		}
	}

}
