package model1;
public interface Itest2 {
	void m2(int x);
	void m3(int y);
	static void m4(int a)
	{
		System.out.println("A: "+a);
	}
	default void m6(int b)
	{
		System.out.println("B: "+b);
	}
}
