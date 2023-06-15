package multilevelInheitance;
class Gparent{
	long mobile = 7896541230l;
	void m1()
	{
		System.out.println("This is Gparent method");
	}
	
}

class Parent extends Gparent
{
	long mobile = 741852630l;
	void getparentmobile()
	{
		System.out.println("Gparent mobile"+super.mobile);
	}
	
}
public class Child extends Parent{
	public static void main(String[] args) {
		System.out.println("Mobile: "+new Child().mobile);
		new Child().getparentmobile();
		new Child().m1();
	}
}