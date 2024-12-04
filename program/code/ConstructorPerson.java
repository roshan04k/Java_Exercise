package program.code;

//Copying the constructor
public class ConstructorPerson {
	//Instance variable
	private String name;
	private int age;

	//Regular constructor
	public  ConstructorPerson(String name,int age)  {
		this.name=name;
		this.age=age;
	}
	
	//Copying the constructor
	public ConstructorPerson(ConstructorPerson other) {
		this.name=other.name;
		this.age=other.age;
	}
	//Getter method
//	public String getName() {
//		return name;
//	}
//	public int getAge() {
//		return age;
//	}
	
	public void display() {
		System.out.println("Name: "+name+" "+"Age : "+age);
	}
	public static void main(String[] args) {
		 ConstructorPerson cp = new  ConstructorPerson("roshan",22);
		 
		 //copy constructor (or)
		 //Object injection
		 ConstructorPerson copy=new ConstructorPerson(cp);
		 
		 cp.display();
		 copy.display();
	}

}
