package taskapp;
public class Task2 implements Runnable {
public void run() {
		for(int j=100;j<=120;j++)
		{
			System.err.println("j: "+j);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}

}
