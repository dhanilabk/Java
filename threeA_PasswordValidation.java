package learningPackage;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
public class threeA_PasswordValidation {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		InputStreamReader r=new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(r);	
		System.out.println("enter password");
		String i =br.readLine();
		threeB_PasswordValidation b = new threeB_PasswordValidation();
		if (b.passwordvalidation(i))
            System.out.println(i + " - Yes");
        else
            System.out.println(i + " - No");

	}

}
