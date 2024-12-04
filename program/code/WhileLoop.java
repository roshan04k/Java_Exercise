package program.code;

public class WhileLoop {
	public static void main(String[] args) {
		int a=1;
		while(a<10) {
			if(a==6) {
				continue;
			}
			System.out.println("Number : "+a);
			a++;
		}
		System.out.println("Final Number : "+a);
	}

}
