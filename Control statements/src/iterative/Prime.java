package iterative;
import java.util.Scanner;
public class Prime {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int low = sc.nextInt();
		int high = sc.nextInt();
		boolean temp = true;
		for(int i=low ;i<=high;i++)
		{
			temp = true;
			for(int j=2;j<=i/2;j++)
			{
				if (i%j==0)
				{
					temp = false;
					break;
				}
			}
			if(temp)
				System.out.println(i+"\t");
		}
		sc.close();
	}
}
