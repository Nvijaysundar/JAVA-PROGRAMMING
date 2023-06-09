package twodimen;
import java.util.Scanner;

public class Palinfact {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int arr[][] = new int[sc.nextInt()][sc.nextInt()];
		
		for(int i=0;i<arr.length;i++)
			for(int j=0;j<arr[i].length;j++)
				arr[i][j] = sc.nextInt();
		
		for(int i[] : arr)
		{
			for(int j : i)
				if(palin(j))
				{
					fact(j);
				}
		}
		sc.close();
	}

	private static void fact(int j) {
		
		long mul =1;
		for(int i=1;i<=j;i++)
			mul *= i;
		System.out.println("fact of "+j+": "+mul);
	}

	private static boolean palin(int j) {
		
		if(String.valueOf(j).equals(new StringBuffer(String.valueOf(j)).reverse().toString()))
			return true;
		return false;
	}
}
