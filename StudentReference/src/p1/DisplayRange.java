package p1;

import java.util.Scanner;

public class DisplayRange {
	public void getRange(Student arr[],Scanner sc)
	{
		System.out.println("Enter Low Range: ");
		int Low = Integer.parseInt(sc.nextLine());
		System.out.println("Enter High Range: ");
		int high = Integer.parseInt(sc.nextLine());
		for(Student temp: arr)
		{
			System.out.println();
			int num = Integer.parseInt(temp.Roll.substring(7));
			if(num>=Low && num<=high)
				new Display().disp(temp);
		
		}
	}
}
