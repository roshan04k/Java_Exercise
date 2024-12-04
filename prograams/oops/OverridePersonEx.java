package prograams.oops;

public class OverridePersonEx extends OverridePerson{
	
	public void  personDetails() {
		System.out.println("Role changed to senior-admin");
	}
	public void  employeeDetails() {
		System.out.println("Role changed to senior java developer");
	}
	public void  studentDetails() {
		System.out.println("Role changed to employee");
	}
	
	public static void main(String[] args) {
		OverridePersonEx op = new OverridePersonEx();
		op.personDetails();
		op.employeeDetails();
		op.studentDetails();
	}

}
