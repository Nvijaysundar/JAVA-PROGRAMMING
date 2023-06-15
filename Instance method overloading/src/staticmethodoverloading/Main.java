package staticmethodoverloading;

public class Main {
	static void m1(int x)
	{
		System.out.println("This is one parameter method");
	}
	static void m1(int x ,int y)
	{
		m1(x);
		System.out.println("This is two parameter method");
	}
	public static void main(String[] args) {
		Main.m1(8,6);
	}
}
