package p2;
import p1.*;
import java.util.*;
public class StudentInfo {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter No of Students: ");
		int no_of_Student = Integer.parseInt(sc.nextLine());
		
		Student s[] = new Student[no_of_Student];
		Contact c[] = new Contact[no_of_Student];
		Address ad[] = new Address[no_of_Student];
		
		for(int i=0;i<no_of_Student;i++) {
		
			System.out.println("Enter Student"+(i+1)+" Details: ");
				
			System.out.print("Enter Name: ");
			String Name = sc.nextLine();
			String Roll;
			while(true)
			{
				System.out.print("Enter Roll No: ");
				Roll = sc.nextLine();
				if((Roll.startsWith("20")||Roll.startsWith("19")||Roll.startsWith("18"))
						&&Roll.length()==10)
					break;
				else
					System.err.println("Invalid Roll No");
			}
			s[i] = new Student(Name, Roll);
			
			System.out.println("Enter Contact Details: ");
			String Emailid;
			while(true)
			{
				
				System.out.print("Enter Emailid:  ");
				 Emailid= sc.nextLine().toLowerCase().trim();
				if(Emailid.endsWith("@gmail.com")||Emailid.endsWith("@yahoo.com"))
					break;
				else
					System.err.println("Invalid Emailid");
			}
			Long mob;
			while(true)
			{	
				System.out.print("Enter Mobile no: ");
				mob= Long.parseLong(sc.nextLine());
				if(mob.toString().length()==10)
					break;
				else
					System.err.println("Invalid Mobile Number");
			}
			
			c[i] = new Contact(Emailid,mob);
			
			System.out.print("Enter Address: ");
			System.out.println("Enter Hno: ");
			String Hno = sc.nextLine();
			System.out.print("Enter Stname: ");
			String Stname = sc.nextLine();
			System.out.print("Enter City: ");
			String City = sc.nextLine();
			
			Integer pin;
			
			while(true)
			{
				System.out.print("Enter Pincode: ");
				pin = Integer.parseInt(sc.nextLine());
				if(pin.toString().length() == 6)
					break;
				else
					System.err.println("Invalid Pincode");
			}
			ad[i] = new Address(Hno, Stname, City, pin);
		}
		
		
		for(int i=0;i<no_of_Student;i++)
		{
			System.out.println();
			s[i].GetData();
			c[i].GetData();
			ad[i].GetData();
			
		}
		sc.close();
	}
}
