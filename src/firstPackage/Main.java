package firstPackage;

public class Main {

	public static void main (String args[]) {
		
		IDandPasswords idandPasswords = new IDandPasswords();
		
		/*so now lets send the login page information from idandPasswords class to loginPage class
		 * by grabbing the getter method and passing the object as an arguement*/
		
		
		LoginPage loginPage = new LoginPage(idandPasswords.getloginInfo ());
	}
}
