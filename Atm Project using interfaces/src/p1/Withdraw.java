package p1;
public class Withdraw implements Transaction{
	public void process(float amt) {
		Transaction.b.balance -= amt;
		Transaction.b.getbal();
	}
}
