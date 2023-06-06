package p1;

public class StudentResult {

	public String generateresult(float per, boolean res) {
		if(res)
		{
			if(per>70 && per<=100)
				return "DISTINCTION";
			else if(per>60)
				return "FIRST CLASS";
			else if(per>50)
				return "SECOND CLASS";
			else if(per>40)
				return "THIRD CLASS";
			else
				return "FAIL";
		}
		else
			return "FAIL";
	}

}
