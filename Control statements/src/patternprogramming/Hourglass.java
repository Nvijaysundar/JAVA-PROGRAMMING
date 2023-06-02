package patternprogramming;
import java.util.Scanner;
public class Hourglass {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			for(int sp = 1;sp<i;sp++)
				System.out.print(" ");
				
			for(int j = i ;j<=n;j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
		for(int i =n-1;i>=1;i--)
		{
			for(int sp = 1;sp<i;sp++)
				System.out.print(" ");
				
			for(int j = i ;j<=n;j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
		sc.close();
	}

}
;
