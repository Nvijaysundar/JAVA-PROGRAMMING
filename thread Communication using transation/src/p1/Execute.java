package p1;

public class Execute {
	public static void main(String[] args) {
		Consumer c = new Consumer();
		new Thread() {
			public void run()
			{
				c.withdraw(15000);
			}
		}.start();
		
	Thread t =	new Thread() {
			public void run()
			{
				c.deposit(6000);
			}
		};
		t.start();
		System.out.println(t.getPriority());
		t.setPriority(1);
		System.out.println(t.getPriority());
		//
	}
}
