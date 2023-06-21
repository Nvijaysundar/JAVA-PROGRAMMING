package userdefinedunchecked;
import java.util.ArrayList;
import java.util.Scanner;

public class DemoUncheck extends Exception{

	public DemoUncheck(String message) {
		super(message);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			ArrayList<BookDetails> al = new ArrayList<BookDetails>();
			System.out.println("Enter No of Books : ");
			int no = Integer.parseInt(sc.nextLine());
			
			for(int i=1;i<=no;i++)
			{
				try {
					BookDetails bd = new BookDetails();
					System.out.println("Enter Code: ");
					bd.code = sc.nextLine();
					System.out.println("Enter Name: ");
					bd.name = sc.nextLine();
					System.out.println("Enter Price: ");
					bd.price = Float.parseFloat(sc.nextLine());
					if(bd.price<=0)
					{
						DemoUncheck ob = new DemoUncheck("Invalid Price");
						throw ob;
					}
					System.out.println("ENter Qty: ");
					bd.qty = Integer.parseInt(sc.nextLine());
					if(bd.qty<=0)
					{
						DemoUncheck ob = new DemoUncheck("Invalid Qty");
						throw ob;
					}
					al.add(bd);
				}
				catch (DemoUncheck e) {
					System.out.println(e);
					i--;
				}
				
			}
			
			System.out.println("==Book deatails==");
			al.forEach( (k)->{
				System.out.println(k.toString());
			});
		}
		catch (NumberFormatException e) {
			System.out.println("Enter only Integer Value");
		}
		finally {
			sc.close();
		}
	}
}
