package program.code;
import java.util.*;

public class CollectionEx {

	public static void main(String[] args) {
		
		//Adding List Elements
		List<String> list = new ArrayList<>();
		//Interface               Class
		
		list.add("Java");
		list.add("Sevlet");
		list.add("SpringBoot");
		
		System.out.println("List : "+list);
		//Getting the value by index
		System.out.println("List : "+list.get(1));

		//Adding Set Elements
		Set<String> set = new HashSet<>();
		set.add("OOPS");
		set.add("Multithreading");
		set.add("Arrays");
		
		System.out.println("Set : "+set);
	
		//Adding Map Elements
		Map<Integer,String> map = new HashMap<>();
		map.put(1,"map1");
		map.put(2,"map2");
		map.put(3,"map3");
		
		System.out.println("Map : "+map);
		System.out.println("Map : "+map.get(2));
		
	}

}
