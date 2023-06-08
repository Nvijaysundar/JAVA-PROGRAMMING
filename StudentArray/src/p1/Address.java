package p1;

public class Address {
	String Hno,Stname,City;
	Integer pincode;
	public Address(String hno, String stname, String city, Integer pincode) {
		Hno = hno;
		Stname = stname;
		City = city;
		this.pincode = pincode;
	}
	
	public void GetData()
	{
		System.out.println("Hno: "+Hno);
		System.out.println("Stname: "+Stname);
		System.out.println("City: "+City);
		System.out.println("Pincode: "+pincode);
	}
	
	
}
