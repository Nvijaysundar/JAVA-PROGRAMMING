package demo_StringBuffer;

public class Case3 {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("Javap"); 
		System.out.println(sb.capacity());
		sb.append("Programming");
		System.out.println(sb.capacity());
		System.out.println(sb.toString());
	}
}
