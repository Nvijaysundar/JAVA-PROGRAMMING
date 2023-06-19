package staticmember_innerclass;

public class ExecuteClass {
	public static void main(String[] args) {
		new SubClass1().m1();
		SubClass1.SubClass2 ob = new SubClass1.SubClass2();
		ob.m3();
		SubClass1.SubClass2.m2();
	}
}
