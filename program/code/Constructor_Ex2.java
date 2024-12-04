package program.code;

public class Constructor_Ex2 {
	public Constructor_Ex2(int RegNo,String name) {
		System.out.println("RegNo: "+RegNo);
		System.out.println("Name: "+name);
	}
	public void displayName() {
		String name="Roshan";
		System.out.println(name);
	}

	public static void main(String[] args) {
		Constructor_Ex2 ce = new Constructor_Ex2(101,"Roshan K");
		ce.displayName();

	}

}
