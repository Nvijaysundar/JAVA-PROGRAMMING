package interface_implementation;

public interface Itest {
	abstract void m1();
	default void m2()
	{
		System.out.println("This is m2 method");
	}
}
