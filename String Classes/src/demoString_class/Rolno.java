package demoString_class;

import java.util.Scanner;

public class Rolno {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String Roll =sc.nextLine();
		if(Roll.length() != 10)
		{
			System.out.println("Invalid Input");
		}
		else
		{
			System.out.println("Year of Joining: 20"+Roll.substring(0,2));
			System.out.println("College Code: "+Roll.substring(2,4));
			System.out.println("Re/Le: "+Roll.substring(4,6));
			System.out.println("Dept Code: "+Roll.substring(6,8));
			System.out.println("Serial no: "+Roll.substring(8));
		}
	}
}
