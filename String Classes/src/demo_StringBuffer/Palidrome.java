package demo_StringBuffer;

import java.util.Scanner;

public class Palidrome {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		if(str.equalsIgnoreCase(new StringBuffer(str).reverse().toString()))
			System.out.println("Palidrome");
		else
			System.out.println("Not a Palidrom");
		sc.close();
	}
}

