package hetroArray;

public class Execute {

	public static void main(String[] args) {
	
		Object arr[] = new Object[3];
		
		arr[0] = new Integer("1235");
		
		arr[1] = new String("Hello");
		
		arr[2] = new Product("Mouse","A121",456.35f, 56);
		
		for(Object temp : arr)
		{
			System.out.println(temp.toString());
		}
	}
}
