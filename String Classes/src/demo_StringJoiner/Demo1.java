package demo_StringJoiner;

import java.util.StringJoiner;

public class Demo1 {
	public static void main(String[] args) {
		StringJoiner sj = new StringJoiner("/");
		sj.add("06").add("06").add("2023");
		System.out.println(sj.toString());
		
		StringJoiner sj2 = new StringJoiner("-");
		sj2.add("Lane1").add("Street1").add("Rjy").add("222222");
		System.out.println(sj2);
		
		sj.merge(sj2);
		System.out.println(sj);
		System.out.println(sj.length());
		
		StringJoiner sj3 = new StringJoiner(" ");
		sj3.setEmptyValue("Joiner is Empty");
		//sj3.add("Hi");
		System.out.println(sj3);
	}
}
