class Demovar{
	
	static int a = 100; //static variables

	int b = 200; // instance variables

	public static void main(String args[])
	{
		int c = 300; // local variable
		System.out.println("C : " + c);
		System.out.println("A : " + Demovar.a);

		Demovar ob = new Demovar();
		System.out.println("B : " + ob.b);
		c += 50;//350
		Demovar.a += 10;//110
		ob.b += 20;//220
		System.out.println();
		System.out.println("C : " + c);
		System.out.println("A : " + Demovar.a);
		System.out.println("B : " + ob.b);

		//newobject
		
		Demovar ob2 = new Demovar();
		System.out.println("\n after new Object");
		System.out.println("C : " + c);
		System.out.println("A : " + Demovar.a);
		System.out.println("B : " + ob2.b);
	}
}