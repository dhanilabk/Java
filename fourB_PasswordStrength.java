package learningPackage;

import java.util.regex.Pattern;

public class fourB_PasswordStrength {
	
	public void passwordStrength(String s) {
		
		int lower=0,upper=0,digit=0,special=0;
		
		
		for(int i=0;i<s.length();i++) {
			
			if(Character.isLowerCase(s.charAt(i))) {
				lower++;
			}else if(Character.isUpperCase(s.charAt(i))) {
				upper++;
			}else if(Character.isDigit(s.charAt(i))) {
				digit++;
			}else  {
				special++;
			}
		}
		System.out.println("Digit: "+digit+"lower: "+lower+"upper: "+upper+"special: "+special);
		if((s.length()<8)&&(s.length()>15))
		{
			System.out.println("Pasword chareacter should range between 8 and 15");
		}
		else if(special<1) {
			System.out.println("Pasword strength is weak include special chareacter ");
			
		}
		else if(digit<2) {
			System.out.println("Pasword strength is weak include 2 digits chareacter ");
	}else if(lower<3) {
		System.out.println("Pasword strength is weak include 3 lower chareacter ");
	}else if(upper<2) {
		System.out.println("Pasword strength is weak include 2 upper chareacter ");
	}else {
		System.out.println("password stregth is satisfying");
	}
	}

}
