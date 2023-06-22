package taskapp;
public class Execute {
	public static void main(String[] args) {
		Thread ob = new Thread(new Task1());
		Thread ob2 = new Thread(new Task2());
		ob.start();
		ob2.start();
	}
}
