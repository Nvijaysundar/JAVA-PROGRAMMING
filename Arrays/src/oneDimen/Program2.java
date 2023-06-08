package oneDimen;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Spliterator;

public class Program2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String names[] = new String[Integer.parseInt(sc.nextLine())];
		for(int i=0;i<names.length;i++)
		{
			names[i]= sc.nextLine();
		}
		
		System.out.println("Using Old For Loop");
		for(int i=0;i<names.length;i++)
			System.out.println("Name"+i+" :"+names[i]);
		
		System.out.println("\nUsing Enhanced for Loop");
		
		for(String temp : names)
			System.out.println(temp);
		
		System.out.println("Using Spliterator<T>: (Java 8)");
		
		Spliterator<String> sp = Arrays.spliterator(names);
		
		sp.forEachRemaining((temp)->
									{
										System.out.println(temp.toString());
									}
						   );
		
		
	}
}
