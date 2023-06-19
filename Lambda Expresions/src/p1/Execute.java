package p1;

public class Execute {
	public static void main(String[] args) {
		Itest1 ob = (int a)->
		{
			System.out.println("This is lambda expression ");
			System.out.println("Values: "+a);
		};
		
		ob.m1(98745);
	}
}
