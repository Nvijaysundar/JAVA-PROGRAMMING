package p2;
import p1.*;
public class Studentdetails {
	public static void main(String[] args) {
		Student stu = new Student("ABC","ISTS123");
		Contact con = new Contact("abc@ists.com",7418529630l);
		Address ad = new Address("A121", "Lane1","RJY",123545);
		Marks m = new Marks(485, false);
		
		stu.getDetails();
		con.getDetails();
		ad.getDetails();
		m.getDetails();
	}
}
