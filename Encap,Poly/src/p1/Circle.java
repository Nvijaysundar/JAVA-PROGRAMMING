package p1;
public class Circle {
	float radius;
	Circle() {
		this.radius = 56.5f;
	}
	Circle(float radius)
	{
		this.radius = radius;
	}
	
	public String toString()
	{
		return String.valueOf(this.radius);
	}
	
	public boolean equals(Object ob)
	{
		Circle c2 = (Circle)ob;
		if(radius==c2.radius)
			return true;
		else
			return false;
	}
	
	public float area()
	{
		return 3.14f * radius *radius;
	}
	
	public float area(Circle c)
	{
		return 3.14f * c.radius * c.radius;
	}
}
