package program.code;

public class DoWhile {
	public static void main(String[] args) {
		int a=0;
		do {
			System.out.println("value a :"+a);
			a++;
			if(a==6) {
				continue;
			}
		}while(a<10);
	}
}
