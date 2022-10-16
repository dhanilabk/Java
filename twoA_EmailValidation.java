package learningPackage;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
public class twoA_EmailValidation {

	public static void main(String[] args) throws Exception {
		
		// TODO Auto-generated method stub
		InputStreamReader r=new InputStreamReader(System.in); 
		BufferedReader br = new BufferedReader(r);	
		System.out.println("enter email");
		String i=br.readLine();
		twoB_EmailValidation b =new  twoB_EmailValidation();
		if (b.isValid(i))
            System.out.println(i + " - Yes");
        else
            System.out.println(i + " - No");

	}

}
