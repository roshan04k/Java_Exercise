package program.code;

import java.util.ArrayList;
import java.util.Iterator;

public class Col_Iterator {

	public static void main(String[] args) {
		ArrayList<String> name = new ArrayList<>();
		
		name.add("Roshan");
		name.add("Vinith");
		name.add("siva");

		Iterator<String> iterator = name.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}

}
//Iterate using iterator package