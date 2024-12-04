package program.code;

public class Methods_Constructor {
	
	public Methods_Constructor() { //Default constructor or non-parameterized constructor
		
	}
	
	public Methods_Constructor(int a,int b) {//Parameterized constructor
		
	}

	public int sum(int a,int b) {
		return a+b;
	}
	public static void main(String[] args) {
		Methods_Constructor add = new Methods_Constructor();
		System.out.println(add.sum(2, 4));

	}

}

/*
 * public int sum(int a,int b)-->method header
 * public-->Access specifier
 * int-->return type
 * sum-->method name
 * int a,int b-->Parameter list
 * sum(int a,int b)-->Method Signature
 */