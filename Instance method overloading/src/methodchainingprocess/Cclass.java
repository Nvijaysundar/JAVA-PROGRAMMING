package methodchainingprocess;
public class Cclass extends Pclass{
	void m1(int x, int y, int z)
	{
		
		System.out.println("This is 3 Paramethod");
		System.out.println("X: "+x);
		System.out.println("y: "+y);
		System.out.println("z: "+z);
		super.m1(x);
	}
	
	void m1(int w,int x, int y, int z)
	{
		this.m1(x, y, z);
		System.out.println("This is 4 Para methods");
		System.out.println("w: "+w);
		System.out.println("X: "+x);
		System.out.println("y: "+y);
		System.out.println("z: "+z);
	}
	
	public static void main(String[] args) {
		new Cclass().m1(84, 65,85,69);
		
	}
}
