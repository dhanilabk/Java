package learningStrings.com;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class removeDuplicatearrayA2 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		removeDuplicatearrayA1 A1= new removeDuplicatearrayA1();
		Scanner sc = new Scanner(System.in);
				System.out.println("Enter array length: ");	
		// TODO Auto-generated method stub
		int l = sc.nextInt();
		int a[] = new int[l];
		System.out.println("Enter array number: ");
		for(int i=0;i<l;i++) {
			
			int n2 = sc.nextInt();
			a[i]=n2;
		}
		A1.removeDuplicate(a);

	}

}
