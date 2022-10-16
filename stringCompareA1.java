package learningStrings.com;

public class stringCompareA1 {
	public String StringCompareFormat(String a1, String a2)
	{
		String s3=a1.toUpperCase();
		StringBuffer bf = new StringBuffer();
		for(int i=0;i<s3.length(); i++) 
			{
				for(int j=0;j<a2.length();j++) 	
					{
					if(s3.charAt(i)==a2.charAt(j))
							{
						bf.append(s3.charAt(i));
						   
							}
					//se
							//
				            //bf.append("+");
				             
							//
			
					}
		
		
			}
		
		return bf.toString();

	}
	
	
}
