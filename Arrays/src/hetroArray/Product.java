package hetroArray;
public class Product {
	String Name,Id;
	Float price;
	public Integer qty;
	public Product(String name, String id, Float price, Integer qty) {
		Name = name;
		Id = id;
		this.price = price;
		this.qty = qty;
	}
	
	public String toString()
	{
		return Name+"\t"+Id+"\t"+price+"\t"+qty;
	}
	
}
