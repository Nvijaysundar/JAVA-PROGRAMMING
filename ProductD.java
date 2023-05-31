class ProductD{
	static String name, id;
	static float price;
	static int qty;
	String sname, semail;
	
	static void setproduct(String Pname, String Pid,float pprice,int pqty )
	{
		name = Pname;
		id = Pid;
		price = pprice;
		qty = pqty;
	}

	void setseller(String psname, String psemail)
	{	
		sname = psname;
		semail = psemail;
	}

	void getdata()
	{
		System.out.println(name+"\t"+id+"\t"+price+"\t"+qty+"\t"+sname+"\t"+semail);
	}

	public static void main(String args[])
	{
		ProductD.setproduct("Mouse","A121",420.65f,500);
		
		ProductD intex = new ProductD();
		intex.setseller("Mouse World","info@mouseworld.com");
		intex.getdata();

		ProductD zebronics  = new ProductD();
		zebronics.setseller("itspares","info@itspares");
		zebronics.getdata();
	}
}