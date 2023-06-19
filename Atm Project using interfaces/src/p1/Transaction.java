package p1;

public interface Transaction {
	Balance b = new Balance(); // NPDTV -> static & final
	abstract void process(float amt);
}
