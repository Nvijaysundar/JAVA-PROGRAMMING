package p1;
public class Employee {
	public String Name, Emailid, Empid;
	public float bsal;
	public void setdetails(String Name, String Emailid, String Empid,float bsal)
	{
		this.bsal = bsal;
		this.Name =Name;
		this.Empid = Empid;
		this.Emailid = Emailid;
	}
	public void getdetails()
	{
		System.out.println("Name : "+Name);
		System.out.println("Emaild: "+Emailid);
		System.out.println("Empid: "+Empid);
		System.out.println("TotalSa: "+ getsal(bsal));
	}
	 float getsal(float bsal) {
		return bsal + 0.17f*bsal + 0.18f*bsal;
	}
}
