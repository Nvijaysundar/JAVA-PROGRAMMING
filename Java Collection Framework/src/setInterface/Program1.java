package setInterface;

import java.util.HashSet;

public class Program1 {
	public static void main(String[] args) {
		HashSet ob = new HashSet();
		ob.add(123);
		ob.add(124.45f);
		ob.add("Name");
		ob.add(true);
		System.out.println(ob.toString());
	}
}
