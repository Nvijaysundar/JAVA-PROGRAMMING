package model2;

public class Iclass extends Pclass implements Itest1 {

	public static void main(String[] args) {
		Iclass ob = new Iclass();
		ob.m1(85);
		ob.m2(741);
	}

	public void m2(int y) {
		System.out.println("y: "+y);
	}

}
