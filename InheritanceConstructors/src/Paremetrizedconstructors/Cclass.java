package Paremetrizedconstructors;
public class Cclass extends Pclass{
	public Cclass(int x)
	{
		super(x);
		System.out.println("This is Cclass Constructor");
	}
	
	public static void main(String[] args) {
		Cclass ob = new Cclass(100);
	}
}
