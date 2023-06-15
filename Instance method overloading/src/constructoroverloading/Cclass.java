package constructoroverloading;
class Pclass {
	Pclass(int x)
	{
		System.out.println("this is one para constructor");
	}
	Pclass(int x, int y)
	{
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
		
		System.out.println("this is Three para constructor");
	}	
	Cclass(int x, int y, int z ,int w)
	{
		
		System.out.println("This is four Para Constructor");
	}
	public static void main(String[] args) {
		new Cclass(78, 45, 65);
	}
}