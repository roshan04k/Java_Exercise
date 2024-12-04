package program.code;

public class ConstructoE_start {

	public static void main(String[] args) {
		ConstructorEngine ce = new ConstructorEngine();
		//Object Dependency injection
		ConstructorE_Car cc = new ConstructorE_Car(ce);
		cc.drive();
	}

}
