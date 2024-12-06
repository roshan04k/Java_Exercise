package program.code;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Lam_EventListener {

	public static void main(String[] args) {
		
		JFrame frame = new JFrame("Lambda Example");
		JButton button = new JButton("Click me");
		
		button.addActionListener(e->System.out.println("Button Clicked"));
	
		frame.add(button);
		frame.setSize(200, 200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

}
