package program.code;

import java.util.Scanner;

public class ExcUser_ValidateAge {

	public static void main(String[] args) {
		int age;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the age : ");
		age = sc.nextInt();
		if(age<=0) {
			try {
				throw new ExcUser_Age();
			}catch(ExcUser_Age e) {
				System.out.println("Exception Raised");
			}
		}
		else {
			System.out.println("Age Entered is : "+age);
		}

	}

}
