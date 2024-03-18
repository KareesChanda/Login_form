package firstPackage;

import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class WelcomePage {
	JFrame frame = new JFrame();
	JLabel WelcomeLabel = new JLabel();
	
	
	WelcomePage(String userID){
		
		WelcomeLabel.setBounds(0, 0, 200, 35);
		WelcomeLabel.setFont(new Font(null, Font.PLAIN, 15));
		WelcomeLabel.setText("Hello "+ userID);
		
		frame.add(WelcomeLabel);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500, 500);
		frame.setLayout(null);
		frame.setVisible(true);
	}
}
