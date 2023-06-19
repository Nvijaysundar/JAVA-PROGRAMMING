package maccess;
import test.*;
public class Demoapp {
	public static void main(String[] args) {
		new Thread(new Display1()).start();
		new Thread(new Display2()).start();
	}
}
