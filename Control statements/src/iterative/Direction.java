package iterative;

import java.util.Scanner;

public class Direction {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int dir,sum =0;
		
		while(true)
		{
			System.out.print("1. Left -1. Right 0.Stop :: ");
			dir= sc.nextInt();
			if(dir == 0)
				break;
			else if(dir == 1 || dir == -1)
				sum += dir;
			else
				continue;
		}
		System.out.println("Sum: "+sum);
		switch(sum%4)
		{
		case 0:
			System.out.println("East");
			break;
		case 1:
		case -3:
			System.out.println("North");
			break;
		case 2:
		case -2:
			System.out.println("WEST");
			break;
		default:
			System.out.println("South");
		}
		sc.close();
	}

}
