package p2;
import p14.*;
import java.util.*;
public class Productinfo {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Product p[] = new Product[Integer.parseInt(sc.nextLine())];
		
		for(int i=0;i<p.length;i++)
		{
			System.out.println("Enter Product"+(i+1)+" Deatils: ");
			System.out.print("Enter Name: ");
			String name = sc.nextLine().toUpperCase().trim();
			System.out.print("Enter ID:");
			String Id = sc.nextLine().toUpperCase().trim();
			System.out.print("Enter Price: ");
			Float pr = Float.parseFloat(sc.nextLine().trim());
			System.out.println("Enter Qty: ");
			Integer qty = Integer.parseInt(sc.nextLine().trim());
			p[i] = new Product(name, Id, pr, qty);	
		}
		
		System.out.println("Name\tId\tPrice\tQty");
		for(Product temp : p)
		{
			System.out.println(temp.toString());
		}
		
		sc.close();
	}
}
