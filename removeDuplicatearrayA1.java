package learningStrings.com;

public class removeDuplicatearrayA1 {
	public void removeDuplicate(int[] a1)	{
		int n=a1.length;
		System.out.println("Array length n: "+n);
		 for(int i = 1; i <=n; i++)
		    {System.out.println(" i: "+i);
		        for(int j = i+1; j <= n;j++ )
		        {System.out.println(" j: "+j);
		            if(a1[j] == a1[i])
		            {
		                for(int k = j; k < n;k++ )
		                {System.out.println(" k: "+k);
		                System.out.println("a1[k]"+a1[k]);
	                    System.out.println("a1[k+1]"+a1[k+1]);
		                    a1[k] = a1[k+1];
		                    System.out.println("after");
		                    System.out.println("a1[k]"+a1[k]);
		                    System.out.println("a1[k+1]"+a1[k+1]);
		                    
		                }
		                j--;
		                n--;
		               
		                
		                System.out.println("decreased number is n: "+n);
		            }
		            else
		            {
		              //  j++;
		            }
		        }
		    }
		 //print aarry
		for(int i=0;i<n;i++) 
		{
			System.out.print(a1[i]);
			
			System.out.print(" ");
		}
		
		
	}

}
