package prograams.oops;

public class EncapsulationAccess {

	public static void main(String[] args) {
		Encapsulation en = new Encapsulation();
		
		en.setName("Roshan");
		en.setRegno(101);
		en.setDept("MCA");
		en.setCollege("KGiSL");
		
		System.out.println(en.getName());
		System.out.println(en.getRegno());
		System.out.println(en.getDept());
		System.out.println(en.getCollege());

	}

}
