package program.code;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Lam_Sort {

	public static void main(String[] args) {
		
		List<String> name = Arrays.asList("Roshan","Abijith","Siva","Java");
		
		Collections.sort(name, (a,b)->a.compareTo(b));
		System.out.println("Sorted names : "+name);
	}

}
