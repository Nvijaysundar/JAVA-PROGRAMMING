package college;

public class Ists {
	public String Name, Emailid,Roll;
	
	public void SetIsts(String Name, String Emailid, String Roll)
	{
		this.Name = Name;
		this.Roll = Roll;
		this.Emailid = Emailid;
	}
	public void getIsts()
	{
		System.out.println("Name: "+Name);
		System.out.println("Roll: "+Roll);
		System.out.println("EMailid : "+Emailid);
	}
}
