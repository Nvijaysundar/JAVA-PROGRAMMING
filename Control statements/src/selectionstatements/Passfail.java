package selectionstatements;
import java.util.Scanner;
public class Passfail {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int s1 = sc.nextInt();
		int s2 = sc.nextInt();
		int s3 = sc.nextInt();
		int s4 = sc.nextInt();
		int s5 = sc.nextInt();
		int s6 = sc.nextInt();
		float per = (s1+s2+s3+s4+s5+s6) /6.0f;
		if (per>=40)
		{
			System.out.println("PASS");
		}
		else
		{
			System.out.println("FAIL");
		}
	}
}
