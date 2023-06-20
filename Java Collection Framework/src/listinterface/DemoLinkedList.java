package listinterface;

import java.util.LinkedList;

public class DemoLinkedList {
	public static void main(String[] args) {
		LinkedList<Integer> li = new LinkedList<Integer>();
		for(int i=0;i<100;i+=2)
		{
			li.add(i);
		}
		System.out.println(li.toString());
	}
}
