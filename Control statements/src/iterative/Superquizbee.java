package iterative;

import java.util.Scanner;

public class Superquizbee {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int regno = sc.nextInt();
		
		int last = regno%10;
		
		while(regno>9)
		{
			regno/=10;
		}
		
		System.out.println("Team : "+Math.abs(last-regno));
		sc.close();
	}
}
