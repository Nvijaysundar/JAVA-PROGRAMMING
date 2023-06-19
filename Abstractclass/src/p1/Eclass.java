package p1;

public class Eclass extends Aclass {

	@Override
	void m1(int x) {
		System.out.println("This is m1 MEthod");	
	}
	
	public static void main(String[] args) {
		Eclass ob = new Eclass();
		
		ob.m1(741);
		ob.m2();
	}
}
