package program.code;

import java.util.Arrays;

public class Array_JAVA8_methods {

	public static void main(String[] args) {
		int[] arr = {3,4,2,5,1};
		
		//sum
		int sum =Arrays.stream(arr).sum();
		System.out.println(sum);
		
		//max
		int maxi = Arrays.stream(arr).max().getAsInt();
		System.out.println(maxi);
		
		//Filtering elements
		int[] filteredArray=Arrays.stream(arr).filter(n->n>2).toArray();	
	    System.out.println(Arrays.toString(filteredArray));
	    
	    //Mapping Array
	    int[] SquaredArray=Arrays.stream(arr).map(n->n*n).toArray();	
	    System.out.println(Arrays.toString(SquaredArray));
	    
	}

}
