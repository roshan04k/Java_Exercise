package program.code;

import java.util.Scanner;

public class Exception_Div {

	public static void main(String[] args) {
		int num1,num2,result;
		
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("Num1 :");
			num1 = sc.nextInt();
			System.out.println("Num1 :");
			num2 = sc.nextInt();
			result =  num1/num2;
			System.out.println("Result :"+result);
		}
		catch(ArithmeticException e) {
			System.out.println("Number cannot div by 0");			
		}
		catch(Exception e) {
			System.out.println("Enter valid point");			
		}
		finally {
			
		}
	}

}
