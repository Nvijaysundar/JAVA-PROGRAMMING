package defaultmethods;

public interface Itest {
	public default void m1(int x)
	{
		System.out.println("x: "+x);
	}
	
	void m2(int y);
}
