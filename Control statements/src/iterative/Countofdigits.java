package iterative;

import java.util.Scanner;

public class Countofdigits {

	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		
		int num = sc.nextInt(),count =0;
		do
		{
			count++;
			num /=10;
		}while(num!=0);
		System.out.println("Count : "+count);
	}

}
