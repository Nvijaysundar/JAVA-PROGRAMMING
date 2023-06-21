package p1;
import java.util.*;
public class DemoMap {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Map<String,Product> m = null;
		System.out.println("1.HashMap\n2.LinkedHashMap\n3.TreeMap\n4.HashTable");
		switch(Integer.parseInt(sc.nextLine()))
		{
		case 1:
			m = new HashMap<String,Product>();
			break;
		case 2:
			m = new LinkedHashMap<String, Product>();
			break;
		case 3:
			m = new TreeMap<String, Product>();
			break;
		case 4:
			m = new Hashtable<String, Product>();
			break;		
		}
		m.put(new String("A121"),new Product("KBB",1300,13));
		m.put(new String("A111"), new Product("CDDR", 1200, 35));
		m.put(new String("A151"),new Product("FDDR",1400,25));
		
		m.forEach( (K,V)->
		{
			System.out.println(K.toString()+"\t"+V.toString());
		});
		
		System.out.println("===KeyData===");
		Set<String> a = m.keySet();
		
		a.forEach((k)->
		{
			System.out.println(k.toString());
		});
		
		System.out.println("---Values----");
		Collection<Product> c = m.values();
		c.forEach( (v)->{
			System.out.println(v.toString());
		} );
		sc.close();
	}
}	
