package program.code;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
public class Lam_Filter {

	public static void main(String[] args) {
		
		List<Integer> num = Arrays.asList(1,8,32,77,9,64,23,39);
		
		List<Integer> even = num.stream().filter(n->n%2==0).collect(Collectors.toList());
		
		System.out.println("Even Numbers : "+even);
	}

}
