package demo_StringTokenizer;

import java.util.StringTokenizer;

public class Demoprogram1 {
	public static void main(String[] args) {
		String str = "Java Programming Language";
		StringTokenizer st = new StringTokenizer(str,"a");
		System.out.println("Count: "+st.countTokens());
		
		while(st.hasMoreTokens())
		{
			System.out.println(st.nextElement());
			System.out.println("count: "+st.countTokens());
		}
	}
}
