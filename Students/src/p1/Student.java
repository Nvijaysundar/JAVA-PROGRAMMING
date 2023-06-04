package p1;

public class Student {
	public String name,Rollno;

	public Student(String name, String rollno) {
		this.name = name;
		Rollno = rollno;
	}
	
	public void getDetails()
	{
		System.out.println("Name: "+name);
		System.out.println("ROll: "+Rollno);
	}
}
