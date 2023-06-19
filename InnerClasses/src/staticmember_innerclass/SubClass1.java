package staticmember_innerclass;
public class SubClass1 {
	public int a = 10;
	public static int b = 20;
	public void m1() {
		System.out.println("A: "+a);
		System.out.println("B: "+b);
	}//outer class method
	//static member inner class
	public static class SubClass2{
		int x = 100;
		static int y = 200;
		public static void m2()
		{
			//System.out.println("X: "+x);
			System.out.println("Y: "+y);
			//System.out.println("a: "+a);
			System.out.println("b: "+b);
		}
		public void m3() //behaves like static wrt to outer class
		{
			System.out.println("X: "+x);
			System.out.println("Y: "+y);
			//System.out.println("a: "+a);
			System.out.println("b: "+b);
		}
	}
}
