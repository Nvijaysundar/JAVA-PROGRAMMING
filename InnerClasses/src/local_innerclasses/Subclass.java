package local_innerclasses;

public class Subclass {
	int a =10;
	static int b = 20;
	
	void m1()
	{
	class Subclass2{
			public void m2()
			{
				System.out.println("Instance m2()");
				System.out.println("a: "+a);
				System.out.println("b: "+b);
			}
			public static void m22()
			{
				System.out.println("Static m22()");
				//System.out.println("A: "+a);
				System.out.println("b: "+b);
			}
		}
	Subclass2 ob2 = new Subclass2();
	ob2.m2();
	Subclass2.m22();
	}
	void m2()
	{
	class Subclass2{
			public void m2()
			{
				System.out.println("Instance m2()");
				System.out.println("a: "+a);
				System.out.println("b: "+b);
			}
			public static void m22()
			{
				System.out.println("Static m22()");
				//System.out.println("A: "+a);
				System.out.println("b: "+b);
			}
		}
	Subclass2 ob2 = new Subclass2();
	ob2.m2();
	Subclass2.m22();
	}
	
	static void m12()
	{
		class Subclass3{
			public void m3()
			{
				System.out.println("Instance m3()");
			//	System.out.println("a: "+a);
				System.out.println("b: "+b);
			}
			public static void m33()
			{
				System.out.println("Static m33()");
				//System.out.println("A: "+a);
				System.out.println("b: "+b);
			}
		}
		Subclass3 ob3 = new Subclass3();
		ob3.m3();
		Subclass3.m33();
		class Subclass4{
			public void m4()
			{
				System.out.println("Instance m3()");
			//	System.out.println("a: "+a);
				System.out.println("b: "+b);
			}
			public static void m44()
			{
				System.out.println("Static m33()");
				//System.out.println("A: "+a);
				System.out.println("b: "+b);
			}
		}
		Subclass4 ob4 = new Subclass4();
		ob4.m4();
		Subclass4.m44();
	}
	public static void main(String[] args) {
		new Subclass().m1();
		Subclass.m12();
	}
}
