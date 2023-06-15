package test;

public class IClass implements Itest {

	@Override
	public void m1(int x) {
		System.out.println("This is m1(X): "+x);
	}

	@Override
	public void m2(int y) {
		System.out.println("This is m2(Y): "+y);
	}
	
	public void m3(int z)
	{
		System.out.println("This is m3(z): "+z);
	}
	public static void main(String[] args) {
		IClass ob = new IClass();
		ob.m1(74);
		ob.m2(85);
		ob.m3(96);
	}
}
