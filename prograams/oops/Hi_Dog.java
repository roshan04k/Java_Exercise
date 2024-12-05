package prograams.oops;

public class Hi_Dog extends Hi_Animal{
	public void DogFood() {
		System.out.println("Dog Eating a food");
	}

	public static void main(String []args) {
		Hi_Cat cat = new Hi_Cat();
		Hi_Dog dog = new Hi_Dog();
		dog.DogFood();
		dog.eat();
		cat.catFood();
		//dog.catFood();       //Compile Time Exception
	}
}
