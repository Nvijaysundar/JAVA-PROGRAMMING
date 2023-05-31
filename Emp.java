class Emp{
	String name, emid, city,dept, deptcode, mname;
	long mobile;
	float bsal;
	static String Cname,branch;
	
	void setData(String pname,String pEmail,String pcity, String pdept,String pdeptcode, String pmname, long pmobile, float pbsal)
	{
		name = pname;
		emid = pEmail;
		city = pcity;
		dept = pdept;
		deptcode = pdeptcode;
		mname = pmname;
		mobile = pmobile;
		bsal = pbsal;
	}
	static float caltsal(float sal)
	{
		return sal + 0.17f*sal + 0.18f*sal;
	}
	void getdata()
	{
		System.out.println("Name: " +name);
		System.out.println("Emid: " +emid);
		System.out.println("city: " +city);
		System.out.println("dept: " +dept);
		System.out.println("Code: " +deptcode);
		System.out.println("Reporting to: " +mname);
		System.out.println("mobile: " +mobile);
		System.out.println("Company: " +Cname);
		System.out.println("Branch: "+branch);		
		System.out.println("Total salary: " + caltsal(bsal));
		System.out.println();
}
	public static void main(String args[])
	{
		Emp e1 = new Emp();
		e1.setData("ABC","ABC@INFO.COM","RJY","HR","HRC","LOREM",7894561230L,27000);
		Emp e2 = new Emp();
		e2.setData("DEF","DEF@INFO.COM","RJY","DEVOPS","MANGEMENT","EPSUM",9876543210L,45000);
		Cname = "INFOWORKS";
		branch = "RJY";
		e1.getdata();
		e2.getdata();
	}
}