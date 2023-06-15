package p1;
public class Point {
	public double x,y;

	public Point(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public Point() {
		this.x = 5;
		this.y = 3;
	}
	
	public void axis(Point p1)
	{
		if(p1.x==0 && p1.y==0)
			System.out.println("This point lies on Orign");
		else if(p1.y ==0)
			System.out.println("This point lies on X - Axis");
		else if(p1.x == 0)
			System.out.println("This is lies on Y - Axis");
	}
	
	public Point centre(Point p1 , Point p2) {
		
		return new Point((p1.x+p2.x)/2.0, (p1.y+p2.y)/2.0);
	}
	
	public double distance(Point p1,Point p2)
	{
		return Math.sqrt((p2.x -p1.x)*(p2.x -p1.x) + (p2.y-p1.y)*(p2.y-p1.y));
	}
	
	public String toString()
	{
		return "( "+x+" , "+y+" )";
	}
	
	public int collinear(Point p1,Point p2, Point p3)
	{
		if( ( (p1.y-p2.y) / (p1.x-p2.x) ) == (p1.y-p3.y)/(p1.x-p3.x))
			return 1;
		return 0;
	}
	
	public static void main(String[] args) {
		System.out.println("Hello");
		Point res = new Point().centre(new Point(4.5,6.5),new Point(8.5,9.6));
		System.out.println("(" +res.x +" , "+res.y+" )");
	}
}
