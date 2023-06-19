package test;

public class Display2 implements Runnable {
	public void run() {
		for(int j=100;j<=110;j++)
		{
			System.err.println("j: "+j);
			try {
				Thread.sleep(1500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}  
		}
	}

}
