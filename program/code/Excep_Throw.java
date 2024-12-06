package program.code;

public class Excep_Throw {
	static void validateAge(int age) {
		if(age<18) {
			throw new IllegalArgumentException("Age must be 18 or above");
		}
		else {
			System.out.println("Age is valid");
		}
	}

	public static void main(String[] args) {
		try {
			validateAge(15);
		}
		catch(IllegalArgumentException e) {
			System.out.println("Catch as exception: "+e.getMessage());
		}
		try {
			validateAge(20);
		}
		catch(IllegalArgumentException e) {
			System.out.println("Catch as exception: "+e.getMessage());
		}
		finally {}

	}

}
