package unboxing;

public class Demo2 {
	public static void main(String[] args) {
		//Boxing process
		Integer ob1 = new Integer(12);
		Float ob2 = new Float(256.335f);
		Character ob3 = new Character('A');
		
		//unboxing
		int i = ob1.intValue();
		float f = ob2.floatValue();
		char ch = ob3.charValue();
		
		System.out.println(i+" "+f+" "+ch);
	}
}
