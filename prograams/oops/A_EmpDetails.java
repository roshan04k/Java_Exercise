package prograams.oops;

public class A_EmpDetails extends A_Employee{

	@Override
	public void futureDesignation() {
		System.out.println("Senior-Java Developer");
		
	}

	public static void main(String[] args) {
		A_EmpDetails ed = new A_EmpDetails();
		ed.designation();
		ed.name();
		ed.futureDesignation();
	}
}
