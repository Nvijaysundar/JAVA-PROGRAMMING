package p2;
import p1.*;
public class MainClass {

	public static void main(String[] args) {
		Product p = new Product("Mouse", "A121",450.56f,35);
		new Display().Disp(p);
	}

}
