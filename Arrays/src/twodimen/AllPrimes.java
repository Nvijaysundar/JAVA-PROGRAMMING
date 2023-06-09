package twodimen;
import java.util.Scanner;
public class AllPrimes {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[][] = new int[sc.nextInt()][sc.nextInt()];
		
		for(int i=0;i<arr.length;i++)
			for(int j=0;j<arr[i].length;j++)
				arr[i][j] = sc.nextInt();
		
		System.out.println("Using Old For  Loop");
		for(int i=0;i<arr.length;i++)
			for(int j=0;j<arr[i].length;j++)
				isprime(arr[i][j]);
		
		System.out.println("This is using Enhanced For loop");
		for(int i[] : arr)
			for(int j : i)
				isprime(j);
		sc.close();
	}

	private static void isprime(int num) {
		
		boolean flag = false;
		for(int i =2;i<=num/2;i++)
			if(num%i == 0)
			{
				flag = true;
				break;
			}
		
		if(flag)
			return;
		else
		{
			System.out.println("Prime: "+num);
			return;
		}
	}
}
