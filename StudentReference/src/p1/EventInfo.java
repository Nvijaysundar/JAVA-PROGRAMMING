package p1;
import java.util.Scanner;
public class EventInfo {
	public void Event(Student arr[], Scanner sc)
	{
		System.out.println("Enter Roll: ");		
		String Rollno = sc.nextLine();
		boolean flag = false;
		for(Student temp: arr)
		{
			if(temp.Roll.equals(Rollno))
			{
				flag = true;
				break;
			}
		}
		if(flag)
		{
			System.out.println("1.Procced with your Branch\n2.Select Branch");
			switch(Integer.parseInt(sc.nextLine()))
			{
			case 1:
				new EventSelction().Event(Rollno.substring(6,8));
				break;
			case 2:
				System.out.println("1.CIVIL\n2.EEE\n3.MECH\n4.ECE\n5.ECE");
				String dept =null;
				switch(Integer.parseInt(sc.nextLine()))
				{
				case 1:
					dept="01";
					break;
				case 2:
					dept ="02";
					break;
				case 3:
					dept ="03";
					break;
				case 4:
					dept = "04";
					break;
				case 5:
					dept = "05";
					break;
				}
				new EventSelction().Event(dept);
				break;
			}
		}
		else
			{
			System.out.println("No Data Present In data Base");
			return;
			}
	}
}
