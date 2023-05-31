class College{

	String Name, Roll, emailid,dept;
	long mobile;
	static String Cname, Cadd, Cemailid;
	

	public static void main(String args[])
	{
	College.Cname = "ISTS";
	College.Cadd = "Rajanagaram";
	College.Cemailid = "reachout@ists.com";
	
	College Stu1 = new College();
	Stu1.Name = "ABC";
	Stu1.Roll = "A121";
	Stu1.emailid = "abc@ists.com";
	Stu1.dept = "IT";
	Stu1.mobile = 999999999;

	College Stu2 = new College();
	Stu2.Name = "DED";
	Stu2.Roll = "A122";
	Stu2.emailid = "ded@ists.com";
	Stu2.dept = "IT";
	Stu2.mobile = 888888888;
	
	System.out.println("Name\tRoll\temailid\t\tDept\tmobile\t\tCname\tCadd\t\tCemail");
	System.out.println(Stu1.Name+"\t"+Stu1.Roll+"\t"+Stu1.emailid+"\t"+Stu1.dept+"\t"+
			Stu1.mobile+"\t"+College.Cname+"\t"+College.Cadd+"\t"+College.Cemailid);
	System.out.println(Stu2.Name+"\t"+Stu2.Roll+"\t"+Stu2.emailid+"\t"+Stu2.dept+"\t"+
			Stu2.mobile+"\t"+College.Cname+"\t"+College.Cadd+"\t"+College.Cemailid);
	}
}