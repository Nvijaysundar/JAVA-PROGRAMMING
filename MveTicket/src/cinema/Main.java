package cinema;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Cinema ci  = new Cinema();
		while(true)
		{
			System.out.println("1.Am\n2.Pm\n3.Display\n4.Exit");
			switch(Integer.parseInt(sc.nextLine()))
			{
			case 1:
				ci.bookSeat(ci.getAm(),sc);
				break;
			case 2:
				ci.bookSeat(ci.getPm(),sc);
				break;
			case 3:
				System.out.println("Seating Status of AM");
				ci.display(ci.getAm());
				System.out.println("Seating Status of PM");
				ci.display(ci.getPm());
				break;
			case 4:
				System.out.println("ThankYou ");
				sc.close();
				System.exit(0);
			}
		}
	}
}
