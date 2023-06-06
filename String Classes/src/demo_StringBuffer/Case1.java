package demo_StringBuffer;

public class Case1 {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		System.out.println("Capacity:"+sb.capacity());
		System.out.println("length:"+sb.length());
		sb.append("Java");
		System.out.println(sb.toString());
		System.out.println("Capacity:"+sb.capacity());
		System.out.println("length:"+sb.length());
		sb.append(" Programming");
		System.out.println(sb.toString());
		System.out.println("Capacity:"+sb.capacity());
		System.out.println("length:"+sb.length());
		sb.append("A");
		System.out.println(sb.toString());
		System.out.println("Capacity:"+sb.capacity());
		System.out.println("length:"+sb.length());
		sb.insert(10,"Hello");
		System.out.println(sb.toString());
		sb.delete(10,15);
		System.out.println(sb.toString());
		sb.deleteCharAt(6);
		System.out.println(sb.toString());
		sb.reverse();
		System.out.println(sb.toString());
	}
}
