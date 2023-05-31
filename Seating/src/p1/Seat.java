package p1;
import java.util.Scanner;
public class Seat {
	String from,to, name, emailid, mode;
	long mobile;
	int seat;
	void setdetails(String from, String to, String name, String emaild,long 
			mobile, int seat, String mode)
	{
		this.from = from;
		this.to = to;
		this.name = name;
		this.emailid = emaild;
		this.mobile = mobile;
		this.seat = seat;
		this.mode = mode;
	}
	
	void getdetails()
	{
		System.out.println("Name: "+name);
		System.out.println("Emaild: "+emailid);
		System.out.println("Mobile : "+mobile);
		System.out.println("from: "+from);
		System.out.println("to: "+to);
		System.out.println("Seat : "+seat);
		System.out.println("Mode: "+mode);
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Name: ");
		String Tname = sc.nextLine();
		System.out.println("Enter Emaild: ");
		String Temail = sc.nextLine();
		System.out.println("Enter Mobile : ");
		long Tmobile = Long.parseLong(sc.nextLine());
		System.out.println("Enter from: ");
		String tfrom = sc.nextLine();
		System.out.println("Enter to :");
		String tto = sc.nextLine();
		System.out.println("Enter Seat : ");
		int tseat  = Integer.parseInt(sc.nextLine());
		System.out.println("Enter Mode: ");
		String tmode = sc.nextLine();
		
		Seat pas1 = new Seat();
		pas1.setdetails(tfrom, tto, Tname, Temail, Tmobile, tseat, tmode);
		pas1.getdetails();
		
		
	}

}
