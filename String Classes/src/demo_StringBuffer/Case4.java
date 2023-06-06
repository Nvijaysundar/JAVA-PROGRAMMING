package demo_StringBuffer;

public class Case4 {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("Java"); 
		System.out.println(sb.capacity());
		System.out.println(sb.toString());
		System.out.println(sb.length());
		sb.append("Hai");
		System.out.println(sb.capacity());
		System.out.println(sb.toString());
		StringBuffer sb2 = new StringBuffer(sb);
		System.out.println(sb2.capacity());
		System.out.println(sb2.toString());
	}
}
