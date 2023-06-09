package oneDimen;
import java.util.*;
public class MaxsumofconArray {
	//kadenes algorthim
	 public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int arr[] = new int[sc.nextInt()];
		
		for(int i=0;i<arr.length;i++)
			arr[i]=sc.nextInt();
		
		int max = Integer.MIN_VALUE,curr_sum=0;  //-2^31
		
		for(int i=0;i<=arr.length-1;i++)
		{
			curr_sum =0;
			for(int j=i;j<=arr.length-1;j++)
				curr_sum+=arr[j];
			if(curr_sum >max)
				max = curr_sum;
		}
		
		System.out.println("Max sum: "+max);
	}
}
