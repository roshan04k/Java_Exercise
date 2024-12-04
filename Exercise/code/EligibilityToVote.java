package Exercise.code;
import java.util.Scanner;

public class EligibilityToVote {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Name :");
		String name = sc.next();
		System.out.println("Enter your age :");
		int a = sc.nextInt();
		if(a>=18) {
			System.out.println(name+", You are Eligible for vote");
		}
		else {
			System.out.println(name+", You are not Eligible");
		}
	}

}
