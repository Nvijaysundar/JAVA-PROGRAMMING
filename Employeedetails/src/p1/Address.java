package p1;

public class Address {
	public String Hno, stname, city;
	public int pincode;
	
	public void setaddress(String Hno,String stname, String city, int pincode)
	{
		this.Hno = Hno;
		this.stname = stname;
		this.city = city;
		this.pincode = pincode;
	}
	
	public void getaddress()
	{
		System.out.println("Hno: "+Hno);
		System.out.println("Stname: "+stname);
		System.out.println("city : "+city);
		System.out.println("pincode: "+pincode);
	}
}
