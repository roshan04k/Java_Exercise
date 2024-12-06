package program.code;

import java.util.ArrayList;

public class Col_ArrayList {

	public static void main(String[] args) {
		
		ArrayList<String> name = new ArrayList<>();
		
		//Adding an array element
		name.add("Roshan");
		name.add("Vinith");
		name.add("siva");

		System.out.println("Added Data: "+name);
		
		//Retrieve the array element
		System.out.println("Retrieve 1 element : "+name.get(1));
		
		//Updating the array element
		name.set(1,"Giruba");
		name.set(2,"Lohit");
		
		System.out.println("Updated Data : "+name);
	
		//Removing the array element
		
		name.remove(2);
		System.out.println("Removed Data : "+name);
		
		System.out.println("Data contains or not : "+name.contains("Roshan"));
		System.out.println("Size of Array list  : "+name.size());
		
		
	}

}
