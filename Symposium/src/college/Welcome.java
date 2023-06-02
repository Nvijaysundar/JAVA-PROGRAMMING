package college;

import java.util.Scanner;

public class Welcome {
	static void dept(Scanner scan)
	{
		System.out.println("1.CS\n2.ECE\n3.IT\nSelect Dept: ");
		switch(Integer.parseInt(scan.nextLine()))
		{
		case 1:
			System.out.println("1.Bigdata\n2.RDBMS\n");
			switch(Integer.parseInt(scan.nextLine()))	
			{
			case 2:
				System.out.println("RDBMS -> Block A Roomno:12");
				break;
			case 1:
				System.out.println("Bigdata -> Block A Room no: 13");
				break;
			}
			break;
		case 2:
			System.out.println("1.Pcb\n2.IOT");
			switch(Integer.parseInt(scan.nextLine()))
			{
			case 1:
				System.out.println("PCB -> BLOCK E Room no: 2");
				break;
			case 2:
				System.out.println("IOT -> BlOCK E Room no: 32");
				break;
			}
			break;
		case 3:
			break;
		default:
			System.out.println("Invalid Dept");
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Ists stu = new Ists();
		OtherClg ostu = new OtherClg();
		System.out.println("Welcome to Symposium");
		System.out.println("1.ISTS\n2.Other College\nSelect College");
		switch(Integer.parseInt(sc.nextLine()))
		{
		case 1:
			System.out.println("Enter name: ");
			String Name = sc.nextLine();
			System.out.println("Enter Roll: ");
			String Roll = sc.nextLine();
			System.out.println("ENter Emaild: ");
			String Email = sc.nextLine();
			stu.SetIsts(Name, Email, Roll);
			stu.getIsts();
			dept(sc);
			break;
		case 2:
			System.out.println("Enter name: ");
			String Name1 = sc.nextLine();
			System.out.println("Enter Roll: ");
			String Roll1 = sc.nextLine();
			System.out.println("ENter Emaild: ");
			String Email1 = sc.nextLine();
			System.out.println("Enter Mobile: ");
			long mob = Long.parseLong(sc.nextLine());
			System.out.println("Enter collge Name: ");
			String clg = sc.nextLine();
			ostu.SetOther(Name1, Email1, Roll1, clg, mob);
			ostu.getOther();
			dept(sc);
			break;
		default:
			System.out.println("Invalid Selection");
				
		}
		sc.close();
	}
}
