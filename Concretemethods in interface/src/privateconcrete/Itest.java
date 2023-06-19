package privateconcrete;

public interface Itest {
	private static void m1()
	{
		System.out.println("This is m1 Method");
	}
	
	private void m2()
	{
		System.out.println("This is m2 Method");
	}
	
	default void access()
	{
		Itest.m1();
		this.m2();
	}
	
}
