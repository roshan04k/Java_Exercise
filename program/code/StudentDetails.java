package program.code;

public class StudentDetails {
	
	private String name;
	private int regno;
	private String location;

	public StudentDetails(String name,int regno,String location) {
		this.name=name;
		this.regno=regno;
		this.location=location;
	}
	public StudentDetails(String name,String location) {
		this(name,0,location);
	}
	public StudentDetails(String name,int regno) {
		this(name,regno,null);
	}
	
	public void displayInfo() {
		System.out.println("Name: "+this.name);
		System.out.println("RegNo: "+this.regno);
		System.out.println("Location: "+this.location);
	}

	public static void main(String[] args) {
		StudentDetails sd1 = new StudentDetails("Roshan",101,"Salem");
		StudentDetails sd2 = new StudentDetails("Siva","Coimbatore");
		StudentDetails sd3 = new StudentDetails("Vinith",102);
		sd1.displayInfo();
		sd2.displayInfo();
		sd3.displayInfo();
	}

}
