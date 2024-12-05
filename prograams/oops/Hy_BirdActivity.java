package prograams.oops;

public class Hy_BirdActivity extends Hy_Eat implements Hy_Fly {


	@Override
	public void fly() {
		System.out.println("Flyable");
		
	}
	public static void main(String[] args) {
		Hy_BirdActivity ba = new Hy_BirdActivity();
		ba.eat();
		ba.fly();
		Hy_Activity ha = new Hy_Activity();
		ha.behaviour();
	}

}