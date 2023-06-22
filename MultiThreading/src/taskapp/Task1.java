package taskapp;
public class Task1 implements Runnable {
	public void run() {
		for(int i=0;i<=20;i++)
		{
			System.out.println("i: "+i);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
