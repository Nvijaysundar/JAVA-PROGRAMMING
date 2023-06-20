package deque;
import java.util.*;
public class DemoArrayDeque {
	public static void main(String[] args) {
		ArrayDeque<Integer> ob = new ArrayDeque<Integer>();
		for(int i=0;i<15;i++)
			if(i%2==0)
				ob.offerFirst(i);
			else
				ob.offerLast(i);
		
		System.out.println(ob.toString());
		
		System.out.println(ob.peekLast());
		System.out.println(ob.removeFirst());
		System.out.println(ob.toString());
		ob.offerLast(12);
		System.out.println(ob.toString());
		ob.removeLastOccurrence(12);
		System.out.println(ob.toString());
	}
}
