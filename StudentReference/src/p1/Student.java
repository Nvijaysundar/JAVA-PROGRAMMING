package p1;
public class Student {
	String Name,Roll;
	Address ad;
	Contact c;
	Marks m;
	public Student(Address ad, Contact c, Marks m) {
		this.ad = ad;
		this.c = c;
		this.m = m;
	}
	
	void getData()
	{
		System.out.println("Name: "+Name);
		System.out.println("Roll: "+Roll);
		System.out.println("Emaild: "+c.Emailid);
		System.out.println("Mobile: "+c.Mobile);
		System.out.println("Hno: "+ad.Hno);
		System.out.println("Stname: "+ad.Stname);
		System.out.println("City: "+ad.City);
		System.out.println("Pincode: "+ad.Pincode);
		System.out.println("Percentage: "+m.per);
		System.out.println("Status: "+m.Status);
	}
}
