package maccess;
import java.util.Scanner;

import p1.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("1.Add\n2.Sub\n3.Mul\n4.Div\n5.Mod");
		switch(sc.nextInt())
		{
		case 1:
			System.out.println("Add: "+
				new Addition().process(sc.nextInt(),sc.nextInt()));
			break;
		case 2:
			System.out.println("Sub: "+
				new Subtraction().process(sc.nextInt(), sc.nextInt()));
			break;
		case 3:
			System.out.println("Mul: "+
				new Mutliplication().process(sc.nextInt(), sc.nextInt()) );
			break;
		case 4:
			System.out.println("Div: "+new Division().process(sc.nextInt(),sc.nextInt()));
			
			break;
		case 5:
			System.out.println("Mod: "+
				new ModdDivision().process(sc.nextInt(), sc.nextInt()));
			break;
		}
		sc.close();
	}
}
