package program.code;

public class ForLoop {

	public static void main(String[] args) {
		int a;
		for(a=1;a<10;a++) {
			if(a==6) {
				continue;
			}
			System.out.println(a);
		}
		System.out.println(a);
	}

}
