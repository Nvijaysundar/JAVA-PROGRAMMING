package oneDimen;
import java.util.Scanner;
public class Evensum_OddIndexSum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[sc.nextInt()];
		for(int i=0;i<arr.length;i++)
			arr[i] = sc.nextInt();
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");
		System.out.println();
		int Esum =0;
		for(int temp: arr)
			if(temp%2 == 0)
				Esum +=temp;
		
		int Oisum = 0;
		for(int i=1;i<arr.length;i+=2)
			Oisum += arr[i];
		
		System.out.println("Esum: "+ Esum);
		System.out.println("Oisum: "+Oisum);
	}
}
