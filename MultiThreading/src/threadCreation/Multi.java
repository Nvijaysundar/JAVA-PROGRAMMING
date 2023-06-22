package threadCreation;
//using Thread class
public class Multi extends Thread {
	public void run()
	{
		System.out.println("this is a Thread. And it is running");
	}
	
	public static void main(String[] args) {
		Multi t = new Multi();
		t.start();
	}
}
