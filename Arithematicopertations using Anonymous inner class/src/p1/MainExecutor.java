package p1;
import java.util.*;
public class MainExecutor {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true)
		{
			System.out.println("1.ADD\n2.Sub\n3.Div\n4.Mul\n5.Mod");
			switch (sc.nextInt()) {
			case 1:
				IArithematic ob = new IArithematic() {
					public double process(int x, int y) {
						return x+y;
					}
				};
				System.out.println("Add : "+ob.process(sc.nextInt(), sc.nextInt()));
				break;
			case 2:
				System.out.println("Sub: "+new IArithematic() {
					public double process(int x, int y) {
						return x-y;
					}
				}.process(sc.nextInt(), sc.nextInt()));
				break;
			case 3:
				System.out.println("mul: "+new IArithematic() {
					public double process(int x, int y) {
						return x*y;
					}
				}.process(sc.nextInt(), sc.nextInt()));
				break;
			case 4:
				System.out.println("Div: "+new IArithematic() {
					public double process(int x, int y) {
						return x/y;
					}
				}.process(sc.nextInt(), sc.nextInt()));
				break;
			case 5:
				System.out.println("Mod: "+new IArithematic() {
					public double process(int x, int y) {
						return x%y;
					}
				}.process(sc.nextInt(), sc.nextInt()));
				break;
			default:
				System.exit(0);
			}
			
			
		}
	}
}
