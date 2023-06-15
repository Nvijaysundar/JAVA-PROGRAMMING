package p1;

public class Product {
	String Name, Id;
	float price;
	static int count ;
	static
	{
		count =0;
	}
	public Product(String name, String id, float price) {
		this.Name = name;
		this.Id = id;
		this.price = price;
	}
	
	public Product()
	{
		this.Name = "Mouse";
		this.price = 456.5f;
		this.Id = "A121";
	}

	@Override
	public String toString() {
		return "Product [Name=" + Name + ", Id=" + Id + ", price=" + price + "]";
	}
	
	{
		count++;
	}
	public static int counter()
	{
		return count;
	}
	public static void main(String[] args) {
		for(int i=0;i<15;i++)
		{
			new Product();
		}
		System.out.println(Product.counter());
	}
}
