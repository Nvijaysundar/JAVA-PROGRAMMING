package instancemethod;
public class Cclass extends Pclass{
	void m1(int x, int y, int z)
	{
		System.out.println("X: "+x);
		System.out.println("y: "+y);
		System.out.println("z: "+z);
	}
	public static void main(String[] args) {
		new Cclass().m1(84, 65);
		System.out.println(new Cclass().m1(74.56f));;
	}
}
