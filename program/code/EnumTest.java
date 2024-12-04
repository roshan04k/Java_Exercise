package program.code;

enum Program{HTML(10),CSS(9),BOOTSTRAP(12), JS(15), JAVA(18), MYSQL(11);

Program(int i) {
	// TODO Auto-generated constructor stub
}};
public class EnumTest {

	public static void main(String[] args) {
		for(Program p:Program.values()) {
			System.out.println(p);
		}

	}

}
