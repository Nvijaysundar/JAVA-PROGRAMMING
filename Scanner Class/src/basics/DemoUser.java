package basics;
import java.util.Scanner;
public class DemoUser {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Name: ");
		String name = sc.nextLine();
		System.out.println("Enter Emailid : ");
		String Email = sc.nextLine();
		System.out.println("Enter Ph: ");
		long ph = sc.nextLong();
		System.out.println("Enter picode: ");
		int pin = sc.nextInt();
		
		System.out.println("Name: "+name);
		System.out.println("Emaild: "+Email);
		System.out.println("ph: "+ph);
		System.out.println("pin: "+pin);
	}

}
