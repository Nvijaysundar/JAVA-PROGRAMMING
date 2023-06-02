package p1;
import java.util.Scanner;
public class Atm {
	static float balance = 15000.0f;
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int pin_chances = 3;
		while(true)
		{
			System.out.println("Enter Pin: ");
			int pin = Integer.parseInt(sc.nextLine()), count=0; //1233
			int temp = pin;
			do {
				temp/=10;
				count++;
			}while(temp!=0);
			
			if(count ==4)
			{
				if(pin == 1111 || pin == 2222 || pin == 3333)
				{
					System.out.println("PIN VERIFIED");
					option(sc);
				}
				else
				{
					System.out.println("Invalid Pin");
					System.out.println("Chances leftover: " + --pin_chances);
					if(pin_chances==0)
					{
						System.out.println("Pin Blocked! Reach nearest branch to "
								+ "change pin");
						sc.close();
						System.exit(0);
					}
				}
			}
			else
			{
				if(count<4)
					System.out.println("Minimum can be of 4 digts");
				else
					System.out.println("Maximum can be of 4 digts");
			}
		}
		
	}
	static void option(Scanner sc) {
		while(true)
		{
			System.out.println("1.Balance\n2.Deposit\n3.Withdraw\n4.exit");
			switch(Integer.parseInt(sc.nextLine()))
			{
			case 1:
				getbal();
				selection(sc);
				break;
			case 2:
				deposit(sc);
				selection(sc);
				break;
			case 3:
				withdraw(sc);
				selection(sc);
				break;
			case 4:
				System.out.println("Thanks for using services. Visit Again!!!");
				sc.close();
				System.exit(0);
			default:
				System.out.println("Invalid Selection");
			}
		}
	}
	static void withdraw(Scanner sc) {
		System.out.println("Enter Amount to Withdrawn: ");
		float amount = Float.parseFloat(sc.nextLine());
		if(formatcheck(amount))
		{
			if(amount<balance)
			{
				balance -= amount;
				getbal();
			}
			else
				System.out.println("Insufficient funds");
		}
		else
		{
			System.out.println("Invalid Format");
		}
	}
	static void deposit(Scanner sc) {
		System.out.println("Enter Amount to be deposited");
		float amount = Float.parseFloat(sc.nextLine());
		if(formatcheck(amount))
		{
			balance  += amount;
			getbal();
		}
		else
			System.out.println("Invalid Format");
	}
	static boolean formatcheck(float amount) {
		if(amount%100 ==0)
			return true;
		return false;
	}
	static void getbal()
	{
		System.out.println("Available Bal:: "+balance);
	}
	static void selection(Scanner sc)
	{
		System.out.println("Y:Continue\nN:Exit");
		switch(sc.nextLine().charAt(0))
		{
		case 'y':
		case 'Y':
			return;
		case 'N':
		case 'n':
			System.out.println("Thank for using services. Visit Again!!");
			System.exit(0);
		}
	}

}
