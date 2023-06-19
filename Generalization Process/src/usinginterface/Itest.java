package usinginterface;

public interface Itest {
	abstract void m1(int x);
	default void m2(int y)
	{
		System.out.println("Y: "+y);
	}
}
