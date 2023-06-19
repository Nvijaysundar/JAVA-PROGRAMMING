package p1;
import java.util.*;
public class Executor {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int pinchances = 3;
		while(true)
		{
			System.out.println("Enter pin: ");
			int pin = sc.nextInt();
			if(pin == 1111|| pin == 2222|| pin == 3333)
			{
				while(true)
				{
					System.out.println("1.Deposit\n2.Withdraw\n3.Balance");
					switch(sc.nextInt())
					{
					case 1:
						System.out.println("Enter Amount:: ");
						int a1 = sc.nextInt();
						if(a1>0 && a1%100==0)
						{
							Transaction t=(float amt)->{
									System.out.println("Deposit Success");
									Transaction.b.balance += a1;
									Transaction.b.getBal();		
							};
							t.process(a1);
						}
						else
							System.out.println("Invalid Amount");
						break;
					case 2:
						System.out.println("Enter Amount:: ");
						int a2 = sc.nextInt();
						if(a2>0 && a2%100==0)
						{
							Transaction t1 =(float bal)-> {
									if(a2>Transaction.b.balance)
									{
										System.out.println("Insufficient Funds");
									}
									else
									{
										System.out.println("Withdraw Success");
										Transaction.b.balance -= a2;
										Transaction.b.getBal();
									}
							};
							t1.process(a2);
						}
						else
							System.out.println("Invalid Amount");
						break;
					case 3:
						Transaction.b.getBal();
						break;
					default:
						System.out.println("Thank for using Services ");
						sc.close();
						System.exit(0);
					}
				}
			}
			else
			{
				System.out.println("Incorrect pin");
				System.out.println("Chances left: "+--pinchances);
				if(pinchances ==0)
				{
					System.out.println("Reach nearest branch to change the pin");
					sc.close();
					System.exit(0);
				}
			}
		}
	}
}
