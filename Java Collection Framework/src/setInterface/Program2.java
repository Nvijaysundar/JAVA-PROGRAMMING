package setInterface;
import java.util.*;
public class Program2 {
	public static void main(String[] args) {
		HashSet<Integer> ob = new HashSet<Integer>();
		for(int i=0;i<20;i++)
			ob.add(i);
		System.out.println(ob.toString());
	}
}
