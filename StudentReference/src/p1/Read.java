package p1;
import java.util.Scanner;
public class Read {
	public void SetData(Scanner sc, Student st)//0x11
	{
		System.out.println("Enter Name: ");
		st.Name = sc.nextLine();
		System.out.println("Enter Roll: ");
		st.Roll= sc.nextLine();
		System.out.println("Enter Emailid: ");
		st.c.Emailid = sc.nextLine();
		System.out.println("Enter Mobile: ");
		st.c.Mobile = Long.parseLong(sc.nextLine());
		System.out.println("Enter Hno: ");
		st.ad.Hno = sc.nextLine();
		System.out.println("Enter Stname: ");
		st.ad.Stname = sc.nextLine();
		System.out.println("Enter City: ");
		st.ad.City = sc.nextLine();
		System.out.println("Enter Pincode: ");
		st.ad.Pincode = Integer.parseInt(sc.nextLine());
		System.out.println("Enter Percentage: ");
		st.m.per = Float.parseFloat(sc.nextLine());
		System.out.println("Enter Status: ");
		st.m.Status = sc.nextLine();
	}
}
