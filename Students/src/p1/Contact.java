package p1;

public class Contact {
	public String emailid;
	public long mobile;
	public Contact(String emailid, long mobile) {
		this.emailid = emailid;
		this.mobile = mobile;
	}
	public void getDetails()
	{
		System.out.println("Emailid: "+emailid);
		System.out.println("Mobile: "+mobile);
	}
}
