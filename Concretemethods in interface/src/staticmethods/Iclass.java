package staticmethods;

public class Iclass implements Itest {

	
	public void m2(int y) {
		System.out.println("Y: "+y);
	}

	public static void main(String[] args) {
		Itest.m1(745);
		new Iclass().m2(96);
	}

}
