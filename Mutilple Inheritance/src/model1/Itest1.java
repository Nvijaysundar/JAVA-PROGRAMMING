package model1;
public interface Itest1 {
	void m1(int x);
	void m3(int y);
	static void m4(int a)
	{
		System.out.println("A: "+a);
	}
	default void m5(int b)
	{
		System.out.println("B: "+b);
	}
}
