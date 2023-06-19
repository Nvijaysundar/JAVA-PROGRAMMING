package interface_implementation;

public class Main {

	public static void main(String[] args) {
		Itest ob = new Itest() {
			
			public void m1() {
				System.out.println("This is overridden methods");
			}
		};
		
		ob.m1();
		ob.m2();
		
	}
	

}
