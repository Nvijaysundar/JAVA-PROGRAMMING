package instancmethodoverriding;
public class Cclass {
	void m1(int a)
	{
		System.out.println("This is CClass M1 Method");
		System.out.println("A" +a);
	}
	
	public static void main(String[] args) {
		new Cclass().m1(85);;
	}
}
