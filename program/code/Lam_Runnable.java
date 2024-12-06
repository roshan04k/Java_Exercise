package program.code;

public class Lam_Runnable {

	public static void main(String[] args) {
		
		Runnable traditional = new Runnable() {

			@Override
			public void run() {
				System.out.println("Running Traditional Runnable");	
			}
			
		};
		
		new Thread(traditional).start();
		
		Runnable lamrun = ()->System.out.println("Lambda  Runnable");
		new Thread(lamrun).start();

	}

}
