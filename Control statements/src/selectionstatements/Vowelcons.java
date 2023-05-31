package selectionstatements;
import java.util.Scanner;
public class Vowelcons {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Char: ");
		switch(sc.nextLine().charAt(0))
		{
		case 'a':
		case 'A':
		case 'E':
		case 'e':
		case 'I':
		case 'O':
		case 'i':
		case 'o':
		case 'u':
		case 'U':
			System.out.println("Vowel");
			break;
		default:
			System.out.println("Consonent");
		}
		sc.close();
	}
}
