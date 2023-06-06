package demoString_class;
import java.util.Scanner;
public class StrinMethod {
	public static void main(String[] args) {
		String str ="Java Programming";
		System.out.println(str.isEmpty());
		System.out.println(str.startsWith("ava",1));
		Scanner sc = new Scanner(System.in);
		/*String emailid = sc.nextLine().toLowerCase(); 
		if(emailid.endsWith("@gmail.com")||emailid.endsWith("@yahoo.com"))
			System.out.println("Valid");
		else
			System.out.println("In valid");
		str = str.replace('J','L');
		System.out.println(str);
		
		str =str.replaceAll("Java","Python");
		System.out.println(str);
		
		str = str.replaceAll("[am]","Hello");
		System.out.println(str);
		
		str = str.replaceFirst("a","Hello");
		System.out.println(str);
		*/
	}
}
