package selectionstatements;
import java.util.Scanner;
public class Mobile {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("1.Samsung\n2.Oneplus\n3.Mi\n4.Apple\nSelect Brand::");
		switch(sc.nextInt())
		{
		case 1:
			System.out.println("Samsung: 12000");
			break;
		case 2:
			System.out.println("Oneplus: 20000");
			break;
		case 3:
			System.out.println("Mi: 9000");
			break;
		case 4:
			System.out.println("Apple: 45000");
			break;
		default:
			System.out.println("Invalid Selection");
		}
		sc.close();
	}
}
