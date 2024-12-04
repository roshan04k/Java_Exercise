package Exercise.code;

import java.util.Scanner;

public class Vowel_Consonant {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your character :");
		String let = sc.next();
		switch(let) {
		case "a":
			System.out.println("It is a vowel");
			break;
		}
	}

}
