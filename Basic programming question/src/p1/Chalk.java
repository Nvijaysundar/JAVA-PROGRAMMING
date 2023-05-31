package p1;
import java.util.Scanner;
public class Chalk {
	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		System.out.println("Enter No of Chalks: ");
		int ch = sc.nextInt();
		int days = ch + (int)Math.sqrt(ch)+1;	
		System.out.println("No of days: "+days);
	}
}
