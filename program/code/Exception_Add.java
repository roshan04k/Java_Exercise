package program.code;
import java.util.Scanner;

public class Exception_Add {

	public static void main(String[] args) {
		int num1,num2,result;
		String snum1,snum2;
		
		Scanner sc = new Scanner(System.in);
		
		try {
			
			System.out.println("Enter the 1st num");
			snum1=sc.next();		
			System.out.println("Enter the 2st num");
			snum2=sc.next();		
			num1 = Integer.parseInt(snum1);
			num2 = Integer.parseInt(snum2);
			result = num1 + num2;
			System.out.println("The result is : "+result);
		}
		catch(Exception e) {
			//System.out.println("Enter the numeric value only : "+e.getMessage());
			e.printStackTrace();
		}
		finally {
			
		}
	}
}
