package listinterface;
import java.util.*;
public class DemoList {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		for(int i=1;i<=10;i++)
		{
			al.add(i);
		}
		System.out.println(al.toString());
		al.add(5, 745);
		System.out.println(al.toString());
		al.remove(6);
		System.out.println(al.toString());
		System.out.println(al.get(5));
		System.out.println(al.indexOf(745));
	}
}
