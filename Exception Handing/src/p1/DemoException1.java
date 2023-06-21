package p1;

import java.util.*;

public class DemoException1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			try {
				System.out.println("Enter No of Elements: ");
				int n = sc.nextInt();
				int a[] = new int[n];
				for(int i=0;i<=n;i++)
					a[i] = sc.nextInt();  
			} 
			catch (InputMismatchException e) {
			System.out.println(e);
			}
			catch(ArrayIndexOutOfBoundsException e)
			{
				System.out.println(e);
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
			
			System.out.println("Program executed");
	}
	

}
