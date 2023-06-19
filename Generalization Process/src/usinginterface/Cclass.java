package usinginterface;

public class Cclass implements Itest{

	public static void main(String[] args) {
		Itest ob = new Cclass();
		
		ob.m1(85);
		ob.m2(96);
	}

	@Override
	public void m1(int x) {
		System.out.println("x: "+x);
	}
	
	public void m3()
	{
		System.out.println("Hello");
	}

}

