package oneDimen;

import java.util.Arrays;
import java.util.Scanner;

public class Prog1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int arr[] = new int[n];
		
		for(int i = 0;i<arr.length;i++)
		{
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Using Old For loop");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print (arr[i]+ " ");
		}
		
		System.out.println("\nusing Extended forloop/enhanced for loop(JAVA 5)");
		
		for(int temp : arr)
		{
			System.out.print(temp +" ");
		}
		
	}
}
