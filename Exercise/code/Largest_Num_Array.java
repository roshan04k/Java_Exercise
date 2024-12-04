package Exercise.code;

public class Largest_Num_Array {

	public static void main(String[] args) {
		int[] a = {5,3,7,20,9};
		int large = a[0];
		for(int i=0;i<a.length;i++) {
			if(a[i]>large) {
				large = a[i];
			}
		}
		System.out.println(large);

	}

}
