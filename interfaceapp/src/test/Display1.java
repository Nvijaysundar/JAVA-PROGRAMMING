package test;

public class Display1 implements Runnable {
	public void run() {
	
		for(int i=110;i<=120;i++) {
			System.out.println("i: "+i);
			try {
				Thread.sleep(1500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}	
		}
	}

}
