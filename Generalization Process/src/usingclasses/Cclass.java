package usingclasses;

public class Cclass extends Pclass {
	void m1()
	{
		System.out.println("This is m1 Method of CClass");
	}
	void m3()
	{
		System.out.println("This is M3 Method of Cclass");
	}
	public static void main(String[] args) {
		Pclass ob = new Cclass();
		
		ob.m1();
		ob.m2();
		
	}
}
