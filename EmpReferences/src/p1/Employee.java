package p1;

public class Employee {
	public String Name, Id;
	public Address ad = null; // reference variable
	public Employee(Address ad) {
		this.ad = ad;
	}
	
	public void getData()
	{
		System.out.println("Name :"+Name);
		System.out.println("Id: "+Id);
		System.out.println("Hno: "+ad.Hno);
		System.out.println("City: "+ad.City);
		System.out.println("Stname: "+ad.Stname);
		System.out.println("pin: "+ad.pincode);
	}
	
}
