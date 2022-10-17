package learningPackage;

import java.util.ArrayList;

public class oneB_LongestBinaryGap {
	
	void longestSubsequence(int n) {
		int max=0;
		
		//int [] bin= new Int[];
		for(int i=1;i<1000;i++)
		{
			ArrayList <Integer> binary =new ArrayList<Integer>();
			int n1=i;
			while(n1>0) {
			
			
							int rem=n1%2;
							binary.add(rem);
							n1=(int) Math.floor(n1/2);
		                 }
			int  []array = new int[binary.size()];
			int count=0;
			
			for (int j=0;j<binary.size();j++)
			{
				for(int k=j+1;k<binary.size();k++) 
				{
				
					if((array[i]!=0)&&(array[j]!=1))
					{
						count++;
					}
					
				}
				
			}System.out.println(count);
		
		}
		
		
	
	}

}
