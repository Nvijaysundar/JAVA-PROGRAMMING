package p1;

public class Product {
	String pName;
	float pPrice;
	int pQty;
	public Product(String pName, float pPrice, int pQty) {
		this.pName = pName;
		this.pPrice = pPrice;
		this.pQty = pQty;
	}
	
	public String toString()
	{
		return pName+"\t"+pPrice+"\t"+pQty;
	}
}
