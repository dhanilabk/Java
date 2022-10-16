package learningPackage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class stringexam {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		InputStreamReader r=new InputStreamReader(System.in); 
		BufferedReader br = new BufferedReader(r);	
		
		String s1=br.readLine();
		String line="";
		

		int c=0;
		for(int i=0;i<s1.length();i++) {
			if(s1.charAt(i)=='r') {
				c++;
			}
		}
		StringBuilder sb = new StringBuilder(line);
		String b = "line has ";
		b=b+c+" occurence";
		
		System.out.println(b);
		

	}

}
