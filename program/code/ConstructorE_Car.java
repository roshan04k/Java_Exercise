package program.code;

public class ConstructorE_Car {

	private final ConstructorEngine engine;
	
	//Constructor dependency injection
	public ConstructorE_Car(ConstructorEngine engine) {
		this.engine=engine;
	}
	
	public void drive() {
		engine.start();
		System.out.println("Car driving");
	}

}
