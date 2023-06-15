package maccess;
import java.util.Scanner;

import p12.Greater;
import p12.Smaller;
public class Mainaccess {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Select 1Greater \n2Smaller");
		switch(Integer.parseInt(sc.nextLine()))
		{
		case 1:
			System.out.println(new Greater().compareTo(89,74));
			break;
		case 2:
			System.out.println(new Smaller().compareTo(85,64));
			break;
		}
		sc.close();
	}
}
