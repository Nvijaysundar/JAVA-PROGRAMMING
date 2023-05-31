package selectionstatements;
import java.util.Scanner;
public class BugeeJump {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Age: ");
		int age = sc.nextInt();
		if (age>=17 && age<=70)
		{
			System.out.println("Enter Height: ");
			if(sc.nextFloat()>=4.8)
			{
				System.out.println("Enter Weight");
				int weight  = sc.nextInt();
				if(weight>=45 && weight<=120)
				{
					if(weight>=85)
						System.out.println("Add Extra Ropes");
					System.out.println("Eligible");
				}
				else
					System.out.println("Not Eligible: Reason: Weight Limit");
			}
			else
				System.out.println("Not Eligible: Reason: Height Limit");
		}
		else
			System.out.println("Not eligible: Reason: Age Limit");
		sc.close();
	}
}
