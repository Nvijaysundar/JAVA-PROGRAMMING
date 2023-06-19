package p1;

import java.util.Scanner;

public class Executor {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		while(true)
		{
			System.out.println("1.Greater\n2.Smaller\n3.Exit");
			switch(sc.nextInt())
			{
			case 1:
				System.out.println(new Icomparable(){
					public int compareTo(int x, int y)
					{
						if (x>y)
							return x;
						else
							return y;
					}
				}.compareTo(sc.nextInt(), sc.nextInt()));
				break;
			case 2:
				System.out.println(new Icomparable(){
					public int compareTo(int x, int y)
					{
						if (x<y)
							return x;
						else
							return y;
					}
				}.compareTo(sc.nextInt(), sc.nextInt()));
				break;
			case 3:
				System.exit(0);
			}
		}
	}
}
