package p1;

public class PassStudents {
	public void GetData(Student arr[])
	{
		for(Student temp : arr)
		{
			System.out.println();
			if(temp.m.Status.equalsIgnoreCase("Pass"))
				new Display().disp(temp);
			
		}
	}
}
