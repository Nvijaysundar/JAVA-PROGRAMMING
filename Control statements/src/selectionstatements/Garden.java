package selectionstatements;

import java.util.Scanner;

public class Garden {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter No of Row's: ");
		int row = sc.nextInt();
		System.out.println("Enter No of Col's: ");
		int col = sc.nextInt();
		System.out.println("Enter Tree no : ");
		int tree = sc.nextInt();
		
		if((tree%col==0)|| (tree%col==1) || (tree>=1 &&tree<=col))
			System.out.println("Mango");
		else
			System.out.println("Not an Mango Tree");
		sc.close();
	}
}
