package Exercise.code;

public class Array_OddEven {

	public static void main(String[] args) {
		int val=0;
		int val1=0;
		int[] a = {1,2,3,4,5,6};
		for(int i=0;i<a.length;i++) {
			if(a[i]%2==0) {
				val=val+1;
			}
			else {
				val1=val+1;
			}
		}
		System.out.println("Number in Even :"+val);
		System.out.println("Number in Odd :"+val1);
	}

}
