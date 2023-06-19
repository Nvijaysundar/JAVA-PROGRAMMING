package defaultmethods;

public class Iclass implements Itest {

	
	public void m2(int y) {
		System.out.println("Y: "+y);
	}

	public static void main(String[] args) {
		Iclass ob = new Iclass();
		ob.m1(85);
		new Iclass().m2(96);
	}

}
