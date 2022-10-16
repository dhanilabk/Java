package learningPackage;
import java.util.*;
import java.io.*;

public class fourA_PasswordStrength {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		InputStreamReader r = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(r);
		System.out.println("enter password");
		String s= br.readLine();
		fourB_PasswordStrength b = new fourB_PasswordStrength();
		b.passwordStrength(s);
		

	}

}
