package instancemember_innerclass;
public class Subclass {
	int a =10;
	static int b = 20;
	public void m1()
	{
		System.out.println("a: "+a);
		System.out.println("b: "+b);
	} //outer class instance method
	
	public class InnerClass{
		int x = 200;
		static int y = 300;
		public void m2()
		{
			System.out.println("x: "+x);
			System.out.println("y: "+y);
			System.out.println("A: "+a);
			System.out.println("B: "+b);
		}
		public static void m3()
		{
			//System.out.println("x: "+x);
			System.out.println("y: "+y);
			//System.out.println("A: "+a);
			System.out.println("B: "+b);
		}
	}
}
