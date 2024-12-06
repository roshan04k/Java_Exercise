package program.code;
import java.util.Scanner;

public class Err_ValidateAge {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the age : ");
		int age = sc.nextInt();
		assert(age<0) && (age<100);
		System.out.println("Entered Age :"+age);

	}

}

/*
 * Run in cmd promt
 * 
 * C:\Users\Roshan K>cd desktop

C:\Users\Roshan K\Desktop>javac Err_ValidateAge.java

C:\Users\Roshan K\Desktop>java -ea Err_ValidateAge
 */