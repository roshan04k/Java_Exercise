package program.code;

public class Lambda {

	public static void main(String[] args) {
		
		//Single Parameter
		
		//Lambda Expression
		Lam_Greet greet = (name)-> System.out.println("Hello "+name);
		
		//Call Method
		greet.sayHello("Roshan");

		//Multiple Parameter
	
		//Lam_Operation
		Lam_Operation add = (a,b)->a+b;    //Type Interface
		Lam_Operation mul = (a,b)->a*b;    //Type Interface
		
		System.out.println("Addition :"+add.operate(10, 20));
		System.out.println("Addition :"+mul.operate(10, 20));
		
		//No Parameter
		
		//Lam_Bike
		Lam_Bike bike = ()->System.out.println("Bike models");
		
		bike.show();
	
	}

}
