package learningPackage;

import java.util.Arrays;

public class Solutionexam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub



Scanner sc = new Scanner (System.in);
System.out.println("enter length");
int n = sc.nextInt();
int flag=0;
int []a = new int[n];

System.out.println("enter numbers");
for (int i=0;i<n;i++)
{
    a[i]=sc.nextInt();
}
Solution s = new Solution();
System.out.println(s.solution (a));
        }
  }