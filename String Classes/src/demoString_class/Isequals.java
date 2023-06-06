package demoString_class;

public class Isequals {
	public static void main(String[] args) {
		String str = "Java";
		String str2 = "Java";
		String str3 = new String("Java");
		String str4 = new String("Java");
		
		if(str==str2)
			System.out.println("Equals");
		else
			System.out.println("Not");
		
		if(str3 == str4)
			System.out.println("Equals");
		else
			System.out.println("Not");
		
		if(str4 == str2)
			System.out.println("Equals");
		else
			System.out.println("Not");
	}
}
