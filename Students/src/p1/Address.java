package p1;

public class Address {
	public String Hno,Stname,City;
	public int pin;
	public Address(String Hno, String stname, String city, int pin) {
		this.Hno = Hno;
		Stname = stname;
		City = city;
		this.pin = pin;
	}
	
	public void getDetails()
	{
		System.out.println("Hno: "+Hno);
		System.out.println("Stname: "+Stname);
		System.out.println("City: "+City);
		System.out.println("Pincode: "+pin);
	}
}
