package test;

public class Iclass implements Itest2 {

	@Override
	public void m1(int x) {
		System.out.println("X: "+x);
	}

	@Override
	public void m2(int y) {
		System.out.println("y: "+y);

	}

	public static void main(String[] args) {
		new Iclass().m1(456);
	}

}
