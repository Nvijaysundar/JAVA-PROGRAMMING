package p1;

public class DemoConstructors {
	int x,y; 
	long a,b;
	float i,j;
	
	DemoConstructors(float i, float j) {
		this.i = i;
		this.j = j;
	}
	void setdata(long a, long b)
	{
		this.a = a;
		this.b = b;
	}
	public static void main(String[] args) {
		//using constructors
		DemoConstructors ob = new DemoConstructors(56.24f,78.69f);
		//direct access
		ob.x  = 45;
		ob.y = 55;
		
		//setter method
		ob.setdata(7854l, 16546l);
		
		
		
		
		
		
		
		
		
		
		
	}
}
