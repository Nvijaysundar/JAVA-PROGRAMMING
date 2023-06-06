package demo_StringTokenizer;

import java.util.Scanner;
import java.util.StringTokenizer;

public class ReverseWords {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringTokenizer st = new StringTokenizer(sc.nextLine());
		
		while(st.hasMoreTokens())
		{
			System.out.print(new StringBuffer(st.nextElement().toString()).reverse()+" ");
		}	
	}
}
