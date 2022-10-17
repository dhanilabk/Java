package learningPackage;

import java.util.Arrays;

public class fiveB_RemoveDuplictes {

	
	public int  removeDuplicates(int [] a, int n) {
		int temp[] = new int[n];int j=0;
		Arrays.sort(a);
		System.out.print("sorted array");
		 for (int i=0; i<n; i++) {
		System.out.print(" "+a[i]);}
		 for (int i=0; i<n-1; i++){  
			 System.out.println("["+i+"]"+a[i]);
	            if (a[i] != a[i+1]){  
	                temp[j] = a[i];
	                j++;
	                System.out.println("in if i: ["+i+"]"+a[i]+"j: ["+j+"]");
	            }  
	         } 
		 System.out.println("in tem["+(j+1)+"],a["+(n-1)+"] :"+a[n-1]);
		temp[j++]=a[n-1];
		for (int i=0;i<j;i++)
		{
			a[i]=temp[i];
		}
		return j;
		
	}
	
	
}
