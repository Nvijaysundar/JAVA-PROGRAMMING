package model3;

public class Iclass implements Itest3 {

	@Override
	public void m1(int x) {
		System.out.println("x: "+x);
	}
	@Override
	public void m2(int y) {
		System.out.println("y: "+y);
	}
	@Override
	public void m3(int z) {
		System.out.println("z: "+z);
	}

	public static void main(String[] args) {
		Iclass ob = new Iclass();
		ob.m1(85);
		ob.m2(74);
		ob.m3(65);
	}

	

}
