package learningStrings.com;
import java.io.*;

public class reverseSubStringA2 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("enter the string :");
		String s=br.readLine(); 
		
		System.out.println("Enter n2: ");
		int n2 = Integer.parseInt(br.readLine());
		
		System.out.println("Enter n1: ");
		int n1 = Integer.parseInt(br.readLine());
		
		
		reverseSubStringA1 A1 = new reverseSubStringA1();
		System.out.println(A1.reverseSubStringFormat(s,n1,n2));
		// TODO Auto-generated method stub
		
		

	}

}
