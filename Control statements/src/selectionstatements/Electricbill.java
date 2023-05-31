package selectionstatements;
import java.util.Scanner;
public class Electricbill {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Select Type : ");
		String type = sc.nextLine();
		System.out.println("Enter No of units used:: ");
		int units = sc.nextInt();
		float total = 0;
		if(type.charAt(0)=='H')
		{
			total += 50;
			
			if(units>0 && units<=70)
				total += units*1;
			else if (units>=71 && units<=150)
			{
				total += 70 +(units-70)*1.45f;
			}
			else if (units>150)
				total += 186 +(units-150)*2.25f;
		}
		else if(type.charAt(0)=='S')
		{
			total += 600;
			if(units>0 && units<=150)
				total += units*1.25f;
			else if (units>=151 && units<=350)
			{
				total += 187.50f +(units-150)*2.36f;
			}
			else if (units>350 && units<=500)
				total += 659.5f +(units-350)*3.50f;
			else if(units>500)
				total += 1184.5f +(units-500)*4.00f;
		}
		else if(type.charAt(0)=='L')
		{
			total += 1500;
			if(units>0 && units<=250)
				total += units*2.25f;
			else if (units>=251 && units<550)
			{
				total += 562.5f +(units-250)*3.80f;
			}
			else if (units>550 && units<=1000)
				total += 1702.5f +(units-550)*4.75f;
			else if(units>1000)
				total += 3840 +(units-1000)*6.15f;
		}
		else
		{
			System.out.println("Invalid Selection");
		}
		System.out.println("Total Payable Amount: "+total+"/-");
		sc.close();
	}
}
