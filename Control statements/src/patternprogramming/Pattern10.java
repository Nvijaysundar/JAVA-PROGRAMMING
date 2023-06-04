package patternprogramming;
import java.util.Scanner;
public class Pattern10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i=1;i<=n;i++)
		{
			for(int sp = 1;sp<=n-i;sp++)
				System.out.print(" ");
			
			for(int star =1;star<=i;star++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		
		for(int i = n-1;i>=1;i--)
		{
			for(int sp = 1;sp<=n-i;sp++)
				System.out.print(" ");
			
			for(int star =1;star<=i;star++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
