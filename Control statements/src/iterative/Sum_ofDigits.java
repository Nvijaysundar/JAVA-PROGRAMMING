package iterative;

import java.util.Scanner;

public class Sum_ofDigits {

	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		
		int num = sc.nextInt(),sum =0;
		while(num!=0)
		{
			sum += num%10;
			num /=10;
		}
		System.out.println("Sum : "+sum);
	}

}
