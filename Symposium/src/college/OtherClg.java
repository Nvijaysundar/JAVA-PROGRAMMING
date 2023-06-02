package college;
public class OtherClg {
public String Name, Emailid,Roll,Clg;
public long mobile;
	public void SetOther(String Name, String Emailid, String Roll, 
			String Clg, long mobile)
	{
		this.Name = Name;
		this.Roll = Roll;
		this.Emailid = Emailid;
		this.Clg = Clg;
		this.mobile = mobile;
	}
	public void getOther()
	{
		System.out.println("Name: "+Name);
		System.out.println("Roll: "+Roll);
		System.out.println("Emailid : "+Emailid);
		System.out.println("Mobile: "+mobile);
		System.out.println("Collge: "+Clg);
	}
}
