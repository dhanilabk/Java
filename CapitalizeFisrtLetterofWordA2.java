package learningStrings.com;
/*18)String a="a very fine day"
 *  output:A Very Fine Day
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CapitalizeFisrtLetterofWordA2 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("enter the string :");
		String s=br.readLine(); 
		CapitalizeFisrtLetterofWordA1 a1 = new CapitalizeFisrtLetterofWordA1();
		System.out.println("Final String is :"+ a1.CapitalizeFisrtLetter(s));

	}

}
