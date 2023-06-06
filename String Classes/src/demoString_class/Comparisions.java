package demoString_class;
import java.util.Scanner;
public class Comparisions {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter String1");
		String str = sc.nextLine().trim();
		
		System.out.println("Enter String2");
		String str2 = sc.nextLine().strip();
		boolean res = str.equalsIgnoreCase(str2);
		if(res)
			System.out.println("String are equals");
		else
			System.out.println("String are Not equals");
		
		int result = str.compareTo(str2);
		if (result == 0)
			System.out.println("Equals");
		else if(result<0)
		{
			System.out.println("s1<s2");
			System.out.println(result);
		}
		else
		{
			System.out.println("s1>s2");
			System.out.println(result);
		}
	}
}
