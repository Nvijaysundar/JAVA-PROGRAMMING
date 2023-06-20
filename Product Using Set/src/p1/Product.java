package p1;
public class Product implements Comparable<Product> {
	String Name, Id;
	Float Price;
	Integer Qty;
	public Product(String name, String id,
			Float price, Integer qty) {
		Name = name;
		Id = id;
		Price = price;
		Qty = qty;
	}
	public String toString() {
		return "Product [Name=" + Name + ", "
				+ "Id=" + Id + ", Price=" +
				Price + ", Qty=" + Qty + "]";
	}
	public int compareTo(Product p) {
		if(Qty.compareTo(p.Qty)==0)
			return 0;
		else if (Qty.compareTo(p.Qty)<0)
			return -1;
		return 1;
	}
	
		
}
