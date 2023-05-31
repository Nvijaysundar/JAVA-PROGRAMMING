class Addition{
	
	static int addvalues()
	{
		int a = 10,b = 20;
		return a+b;
	}
		
	static void multiple()
	{
		int a =100, b = 20;
		System.out.println("res: " + (a*b));
	}
	public static void main(String args[])
	{
		System.out.println("Sum: "+addvalues()); 
		multiple();
 	}

}