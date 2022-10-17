package learningPackage;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//import java.util.io.*;

public class St {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s;int find=0;
		InputStreamReader ir = new InputStreamReader(System.in);
		BufferedReader br= new BufferedReader(ir);
		try {
			while((s=br.readLine())!=null){
			for (int i=0; i<s.length(); i++)
				
			{
			    // checking character in string
			    if (s.charAt(i) == 'l')
			    	find++;
			    
			}
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(find);
	}

}
