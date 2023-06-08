package p1;

public class Student {
	String Name,Roll;

	public Student(String name, String roll) {
		Name = name;
		Roll = roll;
	}
	
	public void GetData()
	{
		System.out.println("Name: "+Name);
		System.out.println("Roll: "+Roll);
	}
}
