package p1;
public class Iclass {
	public static void main(String[] args) {
		Itest1 ob = (int x)->
		{
			System.out.println("X: "+x);
			System.out.println("k: "+Itest1.k);
		};
		
		ob.m1(85);
		ob.access();
	}
}
