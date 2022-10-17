package learningStrings.com;
import java.io.*;
import java.util.*;

public class CapitalizeFisrtLetterofWordA1 {
	
	public String CapitalizeFisrtLetter(String S){
		String Finalstring=null;
		StringBuffer sb = new StringBuffer();
		StringTokenizer st = new StringTokenizer(S," ");
		while(st.hasMoreTokens()){
			String s1,s2,s3;
			s1=st.nextToken();
			s2=s1.substring(0,1);
			s3=s1.substring(1);
			Finalstring=sb.append(s2.toUpperCase()).append(s3).append(" ").toString();
		}
		return Finalstring;
	}
}
