package p1;
public class Product {
	private String Name,Id;
	private Float price;
	private Integer qty;
	public Product(String name, String id, Float price, Integer qty) {
		Name = name;
		Id = id;
		this.price = price;
		this.qty = qty;
	}
	void getProduct()
	{
		System.out.println(Name+"\t"+Id+"\t"+price+"\t"+qty);
	}
}
