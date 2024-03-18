package firstPackage;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class LoginPage implements ActionListener {

	//Lets create out JFrame
	JFrame frame = new JFrame();
	JButton loginButton = new JButton("Login");
	JButton resetButton = new JButton("Reset");
	JTextField userIDField = new JTextField();
	JPasswordField userPasswordField = new JPasswordField();
	JLabel userIDLabel = new JLabel ("UserID:");
	JLabel userPasswordLabel = new JLabel ("Password:");
	JLabel messageLabel = new JLabel ("");
	
			
	
	HashMap <String, String> logininfo = new HashMap<String, String>();
	
	//Constructor
	LoginPage(HashMap<String, String> loginInfoOriginal){
		logininfo = loginInfoOriginal;
		userIDField.setBounds(200, 150, 200, 25);
		userPasswordField.setBounds(200, 195, 200, 25);
		
		loginButton.setBounds(200, 250, 100, 25);
		loginButton.setFocusable(false);
		loginButton.addActionListener(this);
		
		resetButton.setBounds(300, 250, 100, 25);
		resetButton.setFocusable(false);
		resetButton.addActionListener(this);
		
		userIDLabel.setBounds(50, 150, 125, 25);
		userPasswordLabel.setBounds(50, 195, 125, 25);
		messageLabel.setBounds(200, 320, 125, 25);
		
		frame.add(userIDField);
		frame.add(userPasswordField);
		frame.add(loginButton);
		frame.add(resetButton);
		frame.add(userIDLabel);
		frame.add(userPasswordLabel);
		frame.add(messageLabel);
		
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500, 500);
		frame.setLayout(null);
		frame.setVisible(true);
		
		
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		//Lets add actions and consequences 
		
		if(e.getSource() == resetButton) {
			//if reset button gets pressed
			userIDField.setText("");
			userPasswordField.setText("");
		}
		if(e.getSource() == loginButton) {
			//get these two values and store them in the local variables then compare them to the Hash list
			String userID = userIDField.getText();
			String password = String.valueOf(userPasswordField.getPassword());
			
			//compare them to the Hash list
			if(logininfo.containsKey(userID)) {
				if(logininfo.get(userID).equals(password)){
					messageLabel.setForeground(Color.green);
					messageLabel.setText("Login Successful");
					/*before we move on to the welcome page lets not forget to dispose of the old frame
					 * dispose means to close the old page*/
					frame.dispose();
					
					//so of the login is successful the we want to go to the welcome page
					WelcomePage welcomePage= new WelcomePage(userID); //sending user name to welcome page
				}
				else {
					messageLabel.setForeground(Color.red);
					messageLabel.setText("Login Unsuccessful!");
				}
			}
		}
	}
}
