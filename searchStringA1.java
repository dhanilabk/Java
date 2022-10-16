package learningStrings.com;
/*     Searchstring s1="GeniusRajkumarDev";    
 *     String s2="Raj";     
 *        String s3="Dev";  
 *         output:        Return Raj if s2 comes first*/
public class searchStringA1 {
	public String searchStringFormat(String a, String b, String s) {
		int n1= s.indexOf(a);
		int n2= s.indexOf(b);
		if(n1>n2) 
		{
			return b;
		}else
		{
			return a;
		}
				
		
		
	}

}
