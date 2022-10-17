package learningPackage;

public class Rightshift {
	 int[] right(int ar[],int k,int n) {
		
		 int l= n;
		 int a1[]=new int[n];
		 int j=k;
		 int s =l-k-1;int r=s;
		 int  p=0;
		 
		 while(j>0)
		 {
			 a1[j-1]=ar[n-1];
			 n--;j--;
		 }
		 
		 for( int i=0;i<=s;i++) {
				
				a1[k]=ar[i];
				k++;
				System.out.print("a1["+i+"] "+ar[i]);
			 }
		 System.out.println(" ");
		
			 for(int i1=0;i1<a1.length;i1++) {
				 System.out.print(a1[i1]+" ");
			 }
			 return a1;
		}
			
		
		

}
