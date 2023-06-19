package class_extention;

public class Execute {

	public static void main(String[] args) {
		Pclass ob = new Pclass() {
			void m1()
			{
				System.out.println("This is Cclass m1 Over Riddenmethod");
			}
			void m3()
			{
				System.out.println("This is m3");
			}
		};
		
		ob.m1();
		ob.m2();
	}

}
