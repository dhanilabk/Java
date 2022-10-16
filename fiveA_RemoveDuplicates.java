package learningPackage;
import java.util.*;

public class fiveA_RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the limit");
		int n= sc.nextInt();
		int a[]=new int[n];
		System.out.println("enter array elements");
		for(int i=0;i<n;i++){
			a[i]=sc.nextInt();
		}
		
		System.out.println(Arrays.toString(a));
		fiveB_RemoveDuplictes b = new fiveB_RemoveDuplictes();
		int length = b.removeDuplicates(a,n);
		for (int i=0; i<length; i++)  
	           System.out.print(a[i]+" ");  
	    }  
	}


