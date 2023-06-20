package p1;
import java.util.Scanner;
public class Student implements Comparable<Student>{
	Contact c = null;
	Marks m = null;
	Address ad = null;
	String Name, Roll;
	public Student(Contact c, Marks s, Address ad) {
		this.c = c;
		this.m = s;
		this.ad = ad;
	}
	public void read(Scanner sc)
	{
		System.out.println("Enter Name: ");
		this.Name = sc.nextLine();
		System.out.println("Enter Roll: ");
		this.Roll = sc.nextLine();
		System.out.println("Enter Email ID: ");
		this.c.Emailid = sc.nextLine();
		System.out.println("Enter Ph no: ");
		this.c.Phno = Long.parseLong(sc.nextLine());
		System.out.println("Enter Hno: ");
		this.ad.Hno = sc.nextLine();
		System.out.println("Enter City: ");
		this.ad.City = sc.nextLine();
		int sub;
		boolean flag = true;
		for(int i=1;i<=6;i++)
		{
			System.out.println("Enter Sub :: ");
			sub = Integer.parseInt(sc.nextLine());
			if(sub<40)
				flag = false;
			this.m.Tmarks += sub;
		}
		this.m.Per = this.m.Tmarks/6.0f;
		if(flag)
			this.m.Status = "PASS";
		else
			this.m.Status = "FAIL";
	}
	
	public String toString()
	{
		return this.Name+"\t"+this.Roll+"\t"+this.c.Emailid+"\t"+this.c.Phno+"\t"+this.ad.Hno+"\t"+
				this.ad.City+"\t"+this.m.Tmarks+"\t"+this.m.Per+"\t"+this.m.Status;
	}
	
	public int compareTo(Student stud) {
		if(this.m.Tmarks==stud.m.Tmarks)
			return 0;
		else if(this.m.Tmarks<stud.m.Tmarks)
			return -1;
		return 1;
	}
}
