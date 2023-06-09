package twodimen;

import java.util.Scanner;

public class Demo1 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int arr[][] = new int[sc.nextInt()][sc.nextInt()];
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
				arr[i][j] = sc.nextInt();
		}
		
		//Justification memory Representation	
		System.out.println(arr);
		for(int i=0;i<arr.length;i++)
		System.out.println("Row"+i+" :"+arr[i]);
		
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
				System.out.print(arr[i][j] +" ");
			System.out.println();
		}
		sc.close();
	}
}
