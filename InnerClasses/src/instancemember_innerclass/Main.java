package instancemember_innerclass;

public class Main {
	public static void main(String[] args) {
		Subclass ob  = new Subclass();
		ob.m1();
		
		System.out.println("Inner class Access: ");
		Subclass.InnerClass ob2 = ob.new InnerClass();
		
		ob2.m2();
		Subclass.InnerClass.m3();
	}
}
