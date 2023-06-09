package twodimen;

import java.util.Scanner;

public class High_Low {
	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		
		int arr[][] = new int[sc.nextInt()][sc.nextInt()];
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
				arr[i][j] = sc.nextInt();
		}
		
		for(int temp[] : arr)
		{
			for(int temp2 : temp)
				System.out.print(temp2+" ");
			System.out.println();
		}
		
		//greatest number
		for(int i=0;i<arr.length;i++)
		{
			int high = arr[i][0];
			for(int j=1;j<arr[i].length;j++)
				if(high<arr[i][j])
					high = arr[i][j];
			System.out.println("Row"+(i+1)+" : "+high);
		}
		
		//smallest value
		for(int i=0;i<arr.length;i++)
		{
			int low = arr[i][0];
			for(int j=1;j<arr[i].length;j++)
				if(low>arr[i][j])
					low = arr[i][j];
			System.out.println("Row"+(i+1)+" : "+low);
		}
		
		//sum of boundary
		int sum =0;
		for(int i=0;i<arr.length;i++)
			for(int j=0;j<arr[i].length;j++)
				if(i==0 || j==0 || i==(arr.length-1) || j==arr[i].length-1)
					sum += arr[i][j];
		
		System.out.println("Sum of Boundary: "+sum);
		sc.close();
		
	}
}
