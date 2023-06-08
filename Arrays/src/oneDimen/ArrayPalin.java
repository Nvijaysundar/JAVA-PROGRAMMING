package oneDimen;

import java.util.Scanner;

public class ArrayPalin {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[sc.nextInt()];
		
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		int count =0;
		for(int temp : arr)
		{
			
			if(String.valueOf(temp).equals(new StringBuffer(String.valueOf(temp)).reverse().toString()))
				count++;
		}
		
		System.out.println("No of Palidromes: "+count);
		sc.close();
	}
}
