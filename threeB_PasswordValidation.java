package learningPackage;
import java.util.*;
import java.util.regex.Pattern;
public class threeB_PasswordValidation {
	public boolean passwordvalidation(String i) {
		/*
		My password strength criteria is as below :

		    8 characters length
		    2 letters in Upper Case
		    1 Special Character (!@#$&*)
		    2 numerals (0-9)
		    3 letters in Lower Case*/
		
		
		String passwordregex="^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&-+=()])(?=\\S+$).{8,20}$";
				
				/*"^(?=.*[A-Z].*[A-Z])(?=.*[!@#$&*])(?=.*[0-9].*[0-9])(?=.*[a-z].*[a-z].*[a-z]).{8,15}$";*/
				/*+ "(?=.*[A-Z].*[A-Z])(?=.+[@#$%^&-+=()])(?=.*[0-9].*[0-9])(?=.*[a-z].*[a-z].*[a-z]])(?=\\S+$).{8,15}$";
*/
		Pattern pat = Pattern.compile(passwordregex);
		
		if(i==null)return false;
		return pat.matcher(i).matches();
	
		
		
	}

}
