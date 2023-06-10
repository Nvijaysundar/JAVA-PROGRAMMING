package p2;
import java.util.Scanner;
import p1.*;
public class Mainexe {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Student arr[] = new Student[Integer.parseInt(sc.nextLine())];
		
		for(int i=0;i<arr.length;i++)
		{
			arr[i] = new Student(new Address(),new Contact(),new Marks());
			new Read().SetData(sc, arr[i]);
		}
		
		for(int i=0;i<arr.length;i++)
		{
			new Display().disp(arr[i]);
			System.out.println();
		}
		
		while(true)
		{
			System.out.println("1.AllStudent Details\n2.DisplayRange\n3.Pass\n4.Fail\n5.EVE\n6Exit");
			switch(Integer.parseInt(sc.nextLine()))
			{
			case 1:
				for(int i=0;i<arr.length;i++)
				{
					new Display().disp(arr[i]);
					System.out.println();
				}
				break;
			case 2:
				new DisplayRange().getRange(arr,sc);
				break;
			case 3:
				new PassStudents().GetData(arr);
				break;
			case 4:
				new FailStudents().GetData(arr);
				break;
			case 5:
				System.out.println("Welcome to Eve Slection");
				new EventInfo().Event(arr,sc);
				break;
			case 6:
				System.exit(0);
			}
		}
	}
}
