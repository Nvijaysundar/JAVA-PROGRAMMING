package p2;
import java.util.Scanner;
import p1.Address;
import p1.Employee;
public class Executor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Name: ");
		String name = sc.nextLine();
		System.out.println("Enter Emailid: ");
		String Emailid = sc.nextLine();
		System.out.println("Enter Emid");
		String emid = sc.nextLine();
		System.out.println("Enter Bsal");
		float bsal = Float.parseFloat(sc.nextLine());
		Employee e1 = new Employee();
		e1.setdetails(name, Emailid, emid, bsal);
		System.out.println("Enter Hno: ");
		String hno= sc.nextLine();
		System.out.println("Enter Stname: ");
		String stname = sc.nextLine();
		System.out.println("Enter City: ");
		String city = sc.nextLine();
		System.out.println("Enter Pincode: ");
		int pincode = Integer.parseInt(sc.nextLine());
		Address a1 = new Address();
		a1.setaddress(hno, stname, city, pincode);
		e1.getdetails();
		a1.getaddress();	
	}
}
