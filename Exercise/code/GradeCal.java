package Exercise.code;
import java.util.Scanner;

public class GradeCal {

	public static void main(String[] args) {
		System.out.println("Enter a Grade(1-100) :");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		if(a>=90) {
			System.out.println("Grade A");
		}
		else if(a>=80 && a<90) {
			System.out.println("Grade B");
		}
		else if(a>=70 && a<80) {
			System.out.println("Grade C");
		}
		else if(a>=60 && a<70) {
			System.out.println("Grade D");
		}
		else {
			System.out.println("Grade F");
		}
	}

}
