package p1;
import java.util.*;
public class MainExecutor {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true)
		{
			System.out.println("1.ADD\n2.Sub\n3.Div\n4.Mul\n5.Mod");
			IArithematic ob = null;
			switch (sc.nextInt()) {
			case 1:
				ob = (int x, int y)-> {
						return x+y;
					
				};
				System.out.println("Add : "+ob.process(sc.nextInt(), sc.nextInt()));
				break;
			case 2:
				ob = (int x, int y)-> {
					return x-y;
				
			};
			System.out.println("Sub : "+ob.process(sc.nextInt(), sc.nextInt()));
				break;
			case 3:
				ob = (int x, int y)-> {
					return x*y;	
			};
			System.out.println("Mul : "+ob.process(sc.nextInt(), sc.nextInt()));
				break;
			case 4:
				ob = (int x, int y)-> {
					return x/y;
				
			};
			System.out.println("div : "+ob.process(sc.nextInt(), sc.nextInt()));
				break;
			case 5:
				ob = (int x, int y)-> {
					return x%y;
					
			};
			System.out.println("mod : "+ob.process(sc.nextInt(), sc.nextInt()));
				break;
			default:
				System.exit(0);
			}
			
			
		}
	}
}
