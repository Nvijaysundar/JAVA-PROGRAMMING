package constructorChainingprocess;

class Pclass {
	Pclass(int x)
	{
		this();
		System.out.println("this is one para constructor");
	}
	
	Pclass(int x, int y)
	{
		this(x);
		System.out.println("This is Two Para Constructor");
	}
	Pclass()
	{
		System.out.println("THis is 0 Para Constructor");
	}
}

public class Cclass extends Pclass{
	Cclass(int x,int y, int z)
	{
		super(x,y);
		System.out.println("this is Three para constructor");
	}
	
	Cclass(int x, int y, int z ,int w)
	{
		this(x,y,z);
		System.out.println("This is four Para Constructor");
	}
	public static void main(String[] args) {
		new Cclass(78, 45, 65,74);
	}
}