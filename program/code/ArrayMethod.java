package program.code;

import java.util.Arrays;

public class ArrayMethod {

	public static void main(String[] args) {
		
		/*Filling the array*/
		int[] ar = new int[5];
		Arrays.fill(ar,1); //fill with 1
		Arrays.fill(ar,1,4,10); //1-start , 4-end , 2- between
		System.out.println(Arrays.toString(ar));

		//Comparing the array
		int[] arr1 = {1,2,3};
		int[] arr2 = {1,2,3};
		boolean data = Arrays.equals(arr1,arr2);
		System.out.println(data);
		
		//Sorting the array
		int[] arr3 = {3,5,2,7,1};
		Arrays.sort(arr3);
		System.out.println(Arrays.toString(arr3));
		
		//Copying the array
		int[] arr4= {1,2,3,4,5,6,7};
		int[] copy = Arrays.copyOf(arr4,5);//arr4.length for all values
		System.out.println(Arrays.toString(copy));
		int[] copyRange = Arrays.copyOfRange(arr4, 1, 4) ;
		System.out.println(Arrays.toString(copyRange));
		
		//Cloning the array
		int[] arr5= {8,6,3};
		int[] clone = arr5.clone();//store the values
		System.out.println(Arrays.toString(arr5));

	}

}
