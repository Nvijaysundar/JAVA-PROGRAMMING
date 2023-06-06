package demoString_class;
import java.util.Scanner;
public class VCDS {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		String st = sc.nextLine();
		int vc=0,cc=0,dc=0,sy=0,sum=0;
		for(int i=0;i<st.length();i++)
		{
			char ch = st.charAt(i);
			
			if((ch >= 'A' && ch<='Z') ||(ch>='a'&&ch<='z'))
			{
				switch(ch)
				{
				case 'A':
				case 'a':
				case 'e':
				case 'E':
				case 'u':
				case 'U':
				case 'i':
				case 'I':
				case 'O':
				case 'o':
					vc++;
					break;
				default: 
					cc++;
				}
			}
			else if (ch>='0' && ch<='9')
			{
				dc++;
				sum +=Integer.parseInt(String.valueOf(ch));
			}
			else
			{
				sy++;
			}
		}
		System.out.println("Vowel Count: "+vc);
		System.out.println("Consonet COunt: "+cc);
		System.out.println("Digit COunt: "+dc);
		System.out.println("Symbol Count: "+sy);
		System.out.println("Sum: "+sum);
	}
}
