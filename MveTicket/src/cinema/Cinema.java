package cinema;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Cinema {
	//  row           col     seat
	private Map<Integer, Map<Integer,Integer>> Am;
	private Map<Integer, Map<Integer,Integer>> Pm;
	
	public Cinema()
	{
		Am = new HashMap<>();
		Am.put(1, new HashMap<>());
		Am.put(2, new HashMap<>());
		
		for(int i=1;i<=5;i++)
		{
			Am.get(1).put(i,0);
			Am.get(2).put(i,0);
		}
		
		Pm = new HashMap<>();
		Pm.put(1, new HashMap<>());
		Pm.put(2, new HashMap<>());
		for(int i=1;i<=5;i++)
		{
			Pm.get(1).put(i,0);
			Pm.get(2).put(i,0);
		}	
	}
	public Map<Integer,Map<Integer,Integer>> getAm()
	{
		return Am;
	}
	public Map<Integer,Map<Integer,Integer>> getPm()
	{
		return Pm;
	}
	public void bookSeat(Map<Integer, Map<Integer, Integer>> mve, Scanner sc) {
		boolean flag = false;
		for(Map.Entry<Integer,Map<Integer,Integer>> row: mve.entrySet())
		{
			// 1:(1: 0 2:0 3:0 4:0)
			for(Map.Entry<Integer,Integer> col: row.getValue().entrySet())
			{
				if(col.getValue()==0)
				{
					System.out.println("Seats Are available");
					flag = true;
					break;
				}
			}
			if(flag)
				break;
		}
		
		if(flag)
		{
			System.out.println("Seating arragement");
			display(mve);
			System.out.println("Select Row: ");
			int row = Integer.parseInt(sc.nextLine());
			System.out.println("Select Col: ");
			int col = Integer.parseInt(sc.nextLine());
			if(mve.get(row).get(col) ==0)
			{
				mve.get(row).put(col, 1);
				if(row==1)
					System.out.println("Ticket Price: 200/-");
				else
					System.out.println("Ticket Price: 150/-");
			}
			else
				System.out.println("Selected seat is not Available");
		}
		else
		{
			System.out.println("Seating Completed");
		}
		
	}
	public void display(Map<Integer, Map<Integer, Integer>> mve) {
		System.out.println("\t1\t2\t3\t4\t5");
		for(Map.Entry<Integer,Map<Integer,Integer>> row:mve.entrySet())
		{
			System.out.print(row.getKey()+"\t");
			for(int col: row.getValue().values())
			{
				System.out.print(col +"\t");
			}
			System.out.println();
		}
	}
	
}
