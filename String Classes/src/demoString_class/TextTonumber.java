package demoString_class;

import java.util.Scanner;

public class TextTonumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter text to decrypt: ");
		String text = sc.nextLine().toUpperCase();
		text = text.replaceAll("[ABC]","2").replaceAll("[DEF]","3")
				.replaceAll("[GHI]","4").replaceAll("[JKL]","5")
				.replaceAll("[MNO]","6").replaceAll("[PQRS]","7")
				.replaceAll("TUV","8").replaceAll("[WXYZ]","9");
		System.out.println(text);
		sc.close();
	}
}
