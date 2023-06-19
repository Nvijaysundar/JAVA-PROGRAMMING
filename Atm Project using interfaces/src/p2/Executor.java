package p2;
import java.util.*;
import p1.*;
public class Executor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true)
		{
			System.out.println("1.Deposit\n2.Withdraw\n3.Exit");
			switch(sc.nextInt())
			{
			case 1:
				System.out.println("Enter Amount ::");
				new Deposit().process(sc.nextFloat());
				break;
			case 2:
				System.out.println("Enter Amount ::");
				new Withdraw().process(sc.nextFloat());
				break;
			case 3:
				System.exit(0);
			}
		}
	}

}
