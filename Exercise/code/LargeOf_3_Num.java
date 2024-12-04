package Exercise.code;

import java.util.Scanner;

public class LargeOf_3_Num {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Num1 :");
		int a = sc.nextInt();
		System.out.println("Enter your Num2 :");
		int b = sc.nextInt();
		System.out.println("Enter your Num3 :");
		int c = sc.nextInt();
		if(a>=b && a >= c) {
			System.out.println(a+" is largest no of 3");
		}
		else if(b>=a && b>=c) {
				System.out.println(b+" is largest no of 3");
		}
		else if(c>=a && c>=b) {
				System.out.println(c+" is largest no of 3");
		}
	}

}
