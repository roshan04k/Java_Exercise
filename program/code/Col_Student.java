package program.code;

public class Col_Student {

	String name;
	String age;
	
	public Col_Student(String name,String age) {
		this.name=name;
		this.age=age;
	}
	
	@Override
	public String toString() {
		return "Col_Student [name=" + name + ", age=" + age + "]";
	}

}
