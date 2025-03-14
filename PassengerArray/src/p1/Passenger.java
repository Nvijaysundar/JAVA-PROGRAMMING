package p1;
import java.util.Scanner;
public class Passenger {
	String Name;
	Long Mobile;
	Integer Seats, Adults=0, Child=0;
	Float Tamt;
	
	public Passenger(String name, Long mobile, Integer seats, Integer adults, Integer child) {
		Name = name;
		Mobile = mobile;
		Seats = seats;
		Adults = adults;
			Child = child;
			calculateTamt(Adults,Child);
		}
	void getData()
	{
		System.out.println(Name+"\t"+Mobile+"\t"+Adults+"\t"+Child+"\t"+Seats+"\t"+Tamt);
	}
	private void calculateTamt(Integer adults2, Integer child2) {
		Tamt = (float)(adults2 * 150 + child2*100);	
		Tamt += 0.18f*Tamt;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter No of Bookings : ");
		Passenger p[] = new Passenger[Integer.parseInt(sc.nextLine())];
		for(int i=0;i<p.length;i++)
		{
			System.out.print("Enter Name: ");
			String name = sc.nextLine();
			Long mob;
			System.out.print("Enter Mobile: ");
			while(true)
			{
				mob = Long.parseLong(sc.nextLine());
				if(mob.toString().length()== 10)
					break;
				else
					System.out.print("Enter Valid Mobile no: ");
			}
			Integer seats,Adult=0,child=0;
			while(true)
			{
				System.out.print("No of Seats: ");
				seats = Integer.parseInt(sc.nextLine());
				if(seats<=5 && seats>0)
					break;
				else
					System.out.println("Max Seat : 5");
			}
			
			while(true)
			{
				System.out.println("Enter no of Adults: ");
				Adult = Integer.parseInt(sc.nextLine());
				if(Adult <=seats && Adult >=0)
					break;
				else
					System.out.println("Enter Valid info");
			}
			
			if(Adult<seats && Adult>=0)
			{
				while(true)
				{
					System.out.println("Enter no of Child: ");
					child = Integer.parseInt(sc.nextLine());
					if(child+Adult <=seats && child >=0)
						break;
					else
						System.out.println("Enter Valid info");
				}
			}
			else
				System.out.println("All Seats are Blocked");
			
			p[i] = new Passenger(name, mob, seats, Adult, child);
		}
		
			System.out.println("1.Display all bookings\n2.Adults>Child\n3.AllChild\n4.Range");
			switch(Integer.parseInt(sc.nextLine()))
			{
			case 1:
				System.out.println("Name\tMobile\t\tAdults\tChild\tSeats\tTamt");
				for(Passenger temp :p)
					temp.getData();
				break;
			case 2:
				System.out.println("Name\tMobile\t\tAdults\tChild\tSeats\tTamt");
				for(Passenger temp :p)
					if(temp.Adults>temp.Child)
						temp.getData();
				break;
			case 3:
				System.out.println("Name\tMobile\t\tAdults\tChild\tSeats\tTamt");
				for(Passenger temp :p)
					if(temp.Child==temp.Seats)
						temp.getData();
				break;
			case 4:
				System.out.println("Enter Lower Range: ");
				float low = Float.parseFloat(sc.nextLine());
				System.out.println("Enter Higher Range: ");
				float High = Float.parseFloat(sc.nextLine());
				System.out.println("Name\tMobile\t\tAdults\tChild\tSeats\tTamt");
				for(Passenger temp :p)
					if(temp.Tamt>=low && temp.Tamt<High)
						temp.getData();
				break;
		}
			sc.close();
	}
}
