package methodchainingprocess;
public class Pclass {
	void m1(int x)
	{
		System.out.println("This is one parameter Method");
		System.out.println("X: "+x);
	}
	float m1(float y)
	{
		return y *100;
	}
	void m1(int x, int y)
	{
		System.out.println("X: "+x);
		System.out.println("y: "+y);
	}
}


