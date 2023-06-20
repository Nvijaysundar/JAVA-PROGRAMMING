package queue;

import java.util.PriorityQueue;

public class DemoPq {
	public static void main(String[] args) {
		PriorityQueue<Integer> ob = new PriorityQueue<Integer>();;
		
		for(int i=1;i<10;i++)
			ob.offer(i);
		
		System.out.println(ob.toString());
		
		System.out.println(ob.peek());
		System.out.println(ob.poll());
System.out.println(ob.toString());
		
		System.out.println(ob.peek());
	}
}
