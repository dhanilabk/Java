package learningStrings.com;

public class reverseSubStringA1 {
	public String reverseSubStringFormat(String S, int n1, int n2){
		StringBuffer sb= new StringBuffer(S);sb.reverse();
		String S1 =sb.substring(n1, n1+n2).toString();
		System.out.println("String is : "+S1);
		
	return S1;	
	}

}
