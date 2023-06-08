package p1;

public class Contact {
	String Emailid;
	Long Mobileno;
	
	public Contact(String emailid, Long mobileno) {
		Emailid = emailid;
		Mobileno = mobileno;
	}
	
	public void GetData()
	{
		System.out.println("Emailid: "+Emailid);
		System.out.println("Mobile: "+Mobileno);
	}
}
