package prograams.oops;
import java.util.Scanner;

public class OverloadingEx1 {

	
	public void add(int a, int b) {
		int c = a+b;
		System.out.println("The value of c is "+c);
	}
	
	public void add(float c,float d ) {
		float e=c+d;
		System.out.println("The value of e is "+e);
	}
	public static void main(String[] args) {
		OverloadingEx1 od = new OverloadingEx1();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the value for a and b: ");
		int a =sc.nextInt();
		int b= sc.nextInt();
		od.add(a,b);

		System.out.println("Enter the value for c and d: ");
		float c =sc.nextFloat();
		float d= sc.nextFloat();
		od.add(c,d);
	}

}
