package selectionstatements;

import java.util.Scanner;

public class Boating {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Boat's capacity: ");
		int bc = sc.nextInt();
		System.out.println("Boat's capacity : "+bc);
		System.out.println("Enter No of Adults: ");
		int na = sc.nextInt();
		System.out.println("Enter No of Childs: ");
		int nc = sc.nextInt();
		
		if((nc*30 + na*75)<=bc)
			System.out.println("Boat is stable");
		else
			System.out.println("Boat will drown");
	}
}
