package selectionstatements;

import java.util.Scanner;

public class Grades {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Sub1 Marks: ");
		int s1 = sc.nextInt();
		System.out.println("Enter sub2 Marks: ");
		int s2 = sc.nextInt();
		System.out.println("ENter Sub3 Marks: ");
		int s3 = sc.nextInt();
		System.out.println("Enter sub4 Marks: ");
		int s4 = sc.nextInt();
		System.out.println("Enter sub5 Marks: ");
		int s5 = sc.nextInt();
		System.out.println("Enter Sub6 marks: ");
		int s6 = sc.nextInt();
		
		float per = (s1+s2+s3+s4+s5+s6)/6.0f;
		System.out.println("Percentage: "+per);
		if(per>=90)
			System.out.println("A");
		else if(per>=80)
			System.out.println("B+");
		else if(per>= 70)
			System.out.println("B");
		else if(per>=60)
			System.out.println("C");
		else if(per>=40)
			System.out.println("D");
		else 
			System.out.println("F");
		sc.close();
	}

}
