package listinterface;

import java.util.Vector;

public class DemoVetor {
public static void main(String[] args) {
	Vector<Integer> ob = new Vector<Integer>();
	
	System.out.println("Default cap: "+ob.capacity());
	for(int i=0;i<10;i++)
		ob.add(i);
	System.out.println(ob.toString());
	System.out.println("cap: "+ob.capacity());
	ob.add(10);
	System.out.println(ob.toString());
	System.out.println("cap: "+ob.capacity());
	System.out.println(ob.size());
	for(int i=0;i<=11;i++)
	{
		if (i%3==0)
			ob.removeElement(i);
	}
	System.out.println(ob.toString());
}
}
