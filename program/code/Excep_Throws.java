package program.code;

public class Excep_Throws {

	public static int divideNum(int m,int n) throws ArithmeticException,ArrayIndexOutOfBoundsException {
		int div = m/n;
		String[] name = {"Roshan","Vinith","Siva"};
		System.out.println(name[3]);
		return div;
	}
	
	public static void main(String[] args) {
		//Excep_Throws et = new Excep_Throws();
		try {
			System.out.println(divideNum(20,10));
		}catch(ArithmeticException e) {
			System.out.println("Number cannot be divide by 0 "+e.getMessage());
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Arrays Index is out of bounds "+e.getMessage());
		}
	}
}