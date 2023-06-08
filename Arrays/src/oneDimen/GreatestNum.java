package oneDimen;
import java.util.Scanner;
import java.util.Arrays;
public class GreatestNum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[sc.nextInt()];
		for(int i = 0;i < arr.length ;i++)
		{
			System.out.println("Enter A new Element: ");
			arr[i] = sc.nextInt();
		}
		int max = arr[0];
		for(int i=0;i<arr.length;i++)
			if(max<arr[i])
				max = arr[i];
		System.out.println("Max: "+max);
		int arr2[] = new int[sc.nextInt()];
		for(int i = 0;i < arr2.length ;i++)
		{
			System.out.println("Enter A new Element: ");
			arr2[i] = sc.nextInt();
		}
		Arrays.sort(arr2); //increment order -Quick sort
		System.out.println(arr2[arr2.length-1]);
	}
}
