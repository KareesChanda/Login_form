package firstPackage;

import java.util.HashMap;

public class IDandPasswords {

	//Since we are not connecting to database right now, lets hold our IDs and Passwords in a hashmap
	HashMap<String, String> loginInfo = new HashMap <String, String>();
	
	
	IDandPasswords(){
		//Constructor 
		
		loginInfo.put("mwamba", "ndola");
		loginInfo.put("yvonne", "tunduma");
		loginInfo.put("joseph", "kabwe");
		loginInfo.put("besa", "lusaka");
		
	}
	
	//Since we want to send this information to any class that requests it, let's create a getter method here
	
	//Lets also make sure that this method is protected
	protected HashMap getloginInfo () {
		return loginInfo;
	}

}
