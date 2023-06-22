package p1;

public class Consumer {
	int amount = 10000;
	synchronized void withdraw(int amt)
	{
		System.out.println("Withdraw Process::");
		if(this.amount<amt)
		{
			System.out.println("Insufficient Funds: Wait for deposit");
			try {
				wait();
			}
			catch(Exception e)
			{
				System.out.println("Exception Raised");
			}
		}
			this.amount-=amt;
			System.out.println("Withdraw completed");
		
	}
	
	synchronized void deposit(int amt)
	{
		System.out.println("Deposit Process:: ");
		this.amount += amt;
		System.out.println("Depsit Sucess full");
		notify();
	}
}
