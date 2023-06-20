package p1;

import java.util.LinkedList;
import java.util.Scanner;
import java.util.StringJoiner;

public class Patient {
	Precription ob = null;
	public Patient(Precription ob) {
		this.ob = ob;
	}
	String Name,Dob,Gender;
	Long Mobile;
	
	void read(Scanner sc )
	{
		System.out.println("Enter Name: ");
		this.Name = sc.nextLine();
		StringJoiner sj = new StringJoiner("-");
		System.out.println("Enter date: ");
		int date =Integer.parseInt(sc.nextLine());
		sj.add(String.valueOf(date));
		
		System.out.println("ENter Month: ");
		switch(Integer.parseInt(sc.nextLine()))
		{
		case 1:
			sj.add("Jan");
			break;
		case 2:
			sj.add("Feb");
			break;
		case 3:
			sj.add("Mar");
			break;
		case 4:
			sj.add("Apr");
			break;
		}
		System.out.println("Enter Year: ");
		int year = Integer.parseInt(sc.nextLine());
		sj.add(String.valueOf(year));
		this.Dob = sj.toString();
		System.out.println("Enter Gender");
		this.Gender = sc.nextLine();
		System.out.println("Enter Mobile: ");
		this.Mobile = Long.parseLong(sc.nextLine());
		System.out.println("Enter No of Fluids: ");
		this.ob.No_of_fluids = Integer.parseInt(sc.nextLine());
		System.out.println("Enter Medication: ");
		this.ob.Medication = sc.nextLine();
		System.out.println("Enter Incharge name: ");
		this.ob.Inchagre = sc.nextLine();
	}
	
	public String toString()
	{
		return Name+"\t"+Dob+"\t"+Gender+"\t"+Mobile+"\t"+ob.No_of_fluids+"\t"+
				ob.Medication+"\t"+ob.Inchagre;
	}
	public static void main(String[] args) {
		LinkedList<Patient> p = new LinkedList<Patient>();
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<3;i++)
		{
			Patient pr = new Patient(new Precription());
			pr.read(sc);
			p.add(pr);
		}
		
		for(Patient temp: p)
		{
			System.out.println(temp.toString());
		}
	}
}
