package p2;
import java.util.Scanner;
import p1.*;
public class MainExe {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Employee em = new Employee(new Address());
		
		System.out.println("Enter Name: ");
		em.Name = sc.nextLine();
		System.out.println("Enter id: ");
		em.Id = sc.nextLine();
		System.out.println("Enter Hno: ");
		em.ad.Hno = sc.nextLine();
		
		System.out.println("Enter Stname: ");
		em.ad.Stname = sc.nextLine();
		System.out.println("Enter City: ");
		em.ad.City = sc.nextLine();
		System.out.println("Enter Pin: ");
		em.ad.pincode = Integer.parseInt(sc.nextLine());
		new Display().Disp(em);
		sc.close();
	}
}
