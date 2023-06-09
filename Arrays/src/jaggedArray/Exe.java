package jaggedArray;

public class Exe {
	public static void main(String[] args) {
		int arr[] = {10,15,26};
		int arr1[] = {56,84,47,96,77};
		int arr2[] = {85};
		
		int jagged[][] = {arr,arr1,arr2};
		
		for(int temp[] : jagged)
			{
			for(int temp2 : temp)
				System.out.print(temp2+" ");
			System.out.println();
			}
	}
}
