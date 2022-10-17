package learningStrings.com;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class searchStringA2 {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter first String: ");
		String s = bf.readLine();
		System.out.println("Enter the search String s2");
		String s1 = bf.readLine();
		System.out.println("Enter the search String s3");
		String s2 = bf.readLine();
		searchStringA1 A1 = new searchStringA1();
		System.out.println(A1.searchStringFormat(s1,s2,s));
		

	}

}
