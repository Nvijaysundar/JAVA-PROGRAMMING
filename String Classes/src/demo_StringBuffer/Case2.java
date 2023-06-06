package demo_StringBuffer;

public class Case2 {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer(5);
		System.out.println(sb.capacity());
		sb.append("Program");
		System.out.println(sb.capacity());
	}
}
