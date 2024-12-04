package program.code;
import java.util.Scanner;

public class Switch_case {

	public static void main(String[] args) {
		System.out.println("Enter a number : ");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		switch(a) {
		case 1:
			System.out.println("Tamil");
			break;
		case 2:
			System.out.println("English");
			break;
		case 3:
			System.out.println("Malayalam");
			break;
		case 4:
			System.out.println("Kanadam");
			break;
		case 5:
			System.out.println("Hindi");
			break;
		default:
			System.out.println("Invalid Language");
		}
	}

}
