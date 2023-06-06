package p1;
import java.util.*;
public class Restaurent {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringJoiner items = new StringJoiner("-");
		StringJoiner prices = new StringJoiner("-");
		while(true)
		{
			System.out.println("1.Admin\n2.Sales\n3.Exit");
			switch(Integer.parseInt(sc.nextLine()))
			{
			case 1:
				boolean flag = false;
				while(true)
				{
					System.out.println("1.Add New Dishes\n2.Esitmate Bill\n3.Menu\n4.Back to Main Option");
					switch(Integer.parseInt(sc.nextLine()))
					{
					case 1:
						System.out.print("Enter Name: ");
						String item = sc.nextLine().toUpperCase().trim();
						System.out.print("Enter Price: ");
						String price = sc.nextLine().trim();
						items.add(item);
						prices.add(price);
						break;
					case 2:
						float amt =0.0f;
						while(true)
						{
							StringTokenizer itemest = new StringTokenizer(items.toString(),"-");
							StringTokenizer priceest= new StringTokenizer(prices.toString(),"-");
							System.out.println("Enter Item Name to order: ");
							String dish = sc.nextLine().toUpperCase();
							if(dish.equals("STOP"))
							{
								System.out.println("AMount: "+amt);
								break;
							}				
							else
							{
								if(items.toString().contains(dish))
								{
									while(itemest.hasMoreElements()&&priceest.hasMoreElements())
									{
										if(itemest.nextToken().equals(dish))
										{
											amt += Float.parseFloat(priceest.nextToken());
										}
										else
											priceest.nextToken();
									}
								}
								else
									System.out.println("Dish Not available");
							}
							
						}
						break;
					case 3:
						StringTokenizer itemsplit = new StringTokenizer(items.toString(),"-");
						StringTokenizer pricesplit = new StringTokenizer(prices.toString(),"-");
						System.out.println("Item\tPrice");
						while(itemsplit.hasMoreElements()&&pricesplit.hasMoreElements())
						{
							System.out.println(itemsplit.nextToken()+"\t"+pricesplit.nextToken());
						}
							break;
					case 4:
						flag = true;
						break;
					}
					if (flag ==true)
						break;
				}
				break;
			case 2:
				break;
			case 3:
				System.out.println("Thankyou!!!");
				sc.close();
				System.exit(0);
			}
		}	
	}
}
