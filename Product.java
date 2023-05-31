class Product{
	static String name, id;
	static float price;
	static int qty;
	String sname, semail;
	public static void main(String args[])
	{
		Product.name = "Mouse";
		Product.id = "M12211";
		Product.price = 420.36f;
		Product.qty =  50;
		
		Product intex = new Product();
		Product zebronics = new Product();
		
		intex.sname = "Mouse world";
		intex.semail ="mw@Mouse.com";
	
		zebronics.sname ="Itspares";
		zebronics.semail ="info@itspares.com";
		
		System.out.println("Name: " + Product.name);
		System.out.println("id : "+Product.id);
		System.out.println("price: "+Product.price+"/-");
		System.out.println("qty:  "+Product.qty);
		
		System.out.println("Name\t\tEmailid");
		System.out.println(intex.sname+"\t"+intex.semail);
		System.out.println(zebronics.sname+"\t"+zebronics.semail);
	}
	
}