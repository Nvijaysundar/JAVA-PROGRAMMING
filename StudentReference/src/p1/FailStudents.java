package p1;

public class FailStudents {

	public void GetData(Student[] arr) {
		for(Student temp : arr)
		{
			System.out.println();
			if(temp.m.Status.equalsIgnoreCase("Fail"))
				new Display().disp(temp);
			
		}
	}

}
