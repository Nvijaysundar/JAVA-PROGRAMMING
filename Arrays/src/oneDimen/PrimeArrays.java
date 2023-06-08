package oneDimen;
import java.util.Scanner;
public class PrimeArrays {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] =  new int[sc.nextInt()], count =0;
		for(int i=0;i<arr.length;i++)
			arr[i] = sc.nextInt();
		
		boolean flag = true;
		for(int temp : arr)
		{
			flag = true;
			for(int i=2;i<=temp/2;i++)
			{
				if(temp%i==0)
					{
						flag = false;
						break;
					}
			}
			if(flag)
				count++;
		}
		System.out.println("NO of primes: "+count);
		sc.close();
	}
}
