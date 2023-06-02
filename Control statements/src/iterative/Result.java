package iterative;
import java.util.Scanner;
public class Result {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sub,sum =0;
		float per;
		boolean res = true;
		for(int i=1;i<=6;i++)
		{
			System.out.print("Enter Sub"+i+"marks: " );
			sub = sc.nextInt();
			sum += sub;
			if (sub<40)
				res = false;
		}
		per = sum/6.0f;
		System.out.println("Percentage: "+per+"%");
		if(res)
		{
			if(per>90)
				System.out.println("A");
			else if(per>80)
				System.out.println("B");
			else if (per > 60)
				System.out.println("C");
			else if(per >=40)
				System.out.println("D");
		}
		else
			System.out.println("FAIL");
	}
}
