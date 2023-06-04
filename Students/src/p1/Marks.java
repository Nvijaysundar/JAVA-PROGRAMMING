package p1;
public class Marks {
	public int Total;
	public float per;
	public boolean result;
	public Marks(int total, boolean result) {
		Total = total;
		this.per = this.Total/6.0f;
		this.result = result;
	}
	public void getDetails()
	{
		System.out.println("Percentage: "+per);
		System.out.print("Grade: ");
		if(result) {
			
			if(per>90)
				System.out.println("A");
			else if (per>70)
				System.out.println("B");
			else if(per >=40)
				System.out.println("C");
		}
		else
			System.out.println("F");
	}
	
}
