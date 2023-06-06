package demoString_class;

import java.util.Scanner;

public class Demo1 {
	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		System.out.println("Enter String: ");
		String str = sc.nextLine();
		int len = str.length(); //length of string
		System.out.println(str.toString());
		
		System.out.println("Charecter of Strings: ");
		for(int i=0;i<len;i++)
		{
			System.out.print(str.charAt(i)+" ");
		}
		System.out.println();
		System.out.println("Reverse of string using loops: ");
		for(int i=len-1;i>=0;i--)
		{
			System.out.print(str.charAt(i)+" ");
		}
	}
}
