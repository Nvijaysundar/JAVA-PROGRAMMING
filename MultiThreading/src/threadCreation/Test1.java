package threadCreation;

public class Test1 implements Runnable {

	public void run() {
		System.out.println("This is Thread body");
	}

	public static void main(String[] args) {
		Test1 ob = new Test1();
		Thread t = new Thread(ob);
		t.start();
	}

}
