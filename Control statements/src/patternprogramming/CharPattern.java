package patternprogramming;

import java.util.Scanner;

public class CharPattern {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		char ch ='A';
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				System.out.print(ch++ +" ");
				if(ch == 'Z'+1)
					ch = 'a';
				else if (ch == 'z'+1)
					ch = 'A';
			}
			System.out.println();
		}
		sc.close();
	}

}
