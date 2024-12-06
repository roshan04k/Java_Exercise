package program.code;

import java.util.HashMap;
import java.util.Map;

public class Col_MapIteration {

	public static void main(String[] args) {
		HashMap<Integer,String> hm = new HashMap<>();
		
		hm.put(1,"Java");
		hm.put(2,"Python");
		hm.put(3,"React");

		System.out.println("Full datas : "+hm);
		
		for(Map.Entry<Integer, String> data : hm.entrySet()) {
			System.out.println("Key : "+data.getKey()+" "+"Value: "+data.getValue());			
		}
	}

}
