package p1;
public class Account {
	String name;
	long account;
	float balance;
	public Account(String name, long account, float balance) {
		this.name = name;
		this.account = account;
		this.balance = balance;
	}
	
	public Account()
	{
		this.name = "ABC";
		this.account = 741852963012l;
		this.balance = 25000f;
	}
	
	public void print()
	{
		System.out.println("Name: "+this.name);
		System.out.println("Account no: "+this.account);
		System.out.println("Balance: "+this.balance); 
	}
	
	public void deposit(Account ac, float amount)
	{
		ac.balance += amount;
	}
	
	public void withdraw(Account ac, float amount)
	{
		if(amount>ac.balance)
			System.out.println("Insufficient funds");
		else
			ac.balance -= amount;
	}
	public Account max_bal(Account ac1, Account ac2)
	{
		if(ac1.balance>ac2.balance)
			return ac1;
		else
			return ac2;
	}
}
