package model1;
public class Iclass implements Itest1, Itest2 {
	public void m2(int x) {
		System.out.println("This is m2");	
		}
	public void m1(int x) {
		System.out.println("This is m1 method");
	}
	public void m3(int y) {
		System.out.println("This is m3 method");
	}
	public static void main(String[] args) {
		Itest1.m4(85);
		Itest2.m4(741);
		Iclass ob = new Iclass();
		ob.m1(85);
		ob.m2(96);
		ob.m3(74);
		ob.m5(68);
		ob.m6(25);
	}
}
