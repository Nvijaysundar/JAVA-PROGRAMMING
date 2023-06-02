package patternprogramming;

public class Pattern6 {
	public static void main(String[] args) {
		int n=9;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if (j==n)
					System.out.print(i+1+" ");
				else
					System.out.print(i+" ");
			}
			System.out.println();
		}
	}
}
