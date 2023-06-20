package p1;

import java.util.Scanner;
import java.util.TreeSet;

public class Product_Collection {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		TreeSet<Product> ob = new TreeSet<Product>();
		
		while(true)
		{
			System.out.println( );
			System.out.println("1.Insert\n2Display\n3.exit");
			switch(Integer.parseInt(sc.nextLine()))
			{
			case 1:
				System.out.println("Enter New Product Details");
				String id = sc.nextLine();
				String Name = sc.nextLine();
				Float price = Float.parseFloat(sc.nextLine());
				Integer Qty = Integer.parseInt(sc.nextLine());
				ob.add(new Product(Name, id, price, Qty));
				System.out.println();
				break;
			case 2:
				System.out.println();
				for(Product temp:ob)
					System.out.println(temp.toString());
				break;
				
			}
		}
	}
}
