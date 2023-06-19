package p1;
public interface Itest1 {
	int k = 100;
	void m1(int x);
	default void access()
	{
		System.out.println("K : "+k);
	}
}
