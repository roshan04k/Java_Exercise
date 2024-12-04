package program.code;

public class Constructor_Ex1 {
	String name;
	int age;
	
	public Constructor_Ex1() {
		name="Roshan";
		age=22;
	}
	//Value doesn't give then it will provide name=null, age =0
	public void displayInfo() {
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
	}

	public static void main(String[] args) {
		Constructor_Ex1 ce = new Constructor_Ex1();
		ce.displayInfo();
	}

}
