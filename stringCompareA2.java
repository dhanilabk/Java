/*1) compare two strings, if the characters in string 1 are present in   string 2, then it should be put as such in output, else '+' should be   put in output...ignore case difference.
        input 1:"New York"        input 2:"NWYR"
        output:N+w+Y+r+
*/
package learningStrings.com;

import java.io.*;

public class stringCompareA2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("String a:");
		String a = br.readLine();
		System.out.println("String b:");
		String b = br.readLine();
		stringCompareA1 A1 = new stringCompareA1();
		A1.StringCompareFormat(a,b);
		
		System.out.println("String is: "+A1.StringCompareFormat(a,b));

	}

}
