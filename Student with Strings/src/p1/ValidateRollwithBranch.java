package p1;

public class ValidateRollwithBranch {
	private String Branch = null;
	public boolean validate(String br,String code)
	{
		switch(code)
		{
		case "01":
			Branch = "CIVIL";
			break;
		case "02":
			Branch = "EEE";
			break;
		case "03":
			Branch = "MECH";
			break;
		case "04":
			Branch = "ECE";
			break;
		case "05":
			Branch = "CSE";
			break;
		case "06":
			Branch = "AI";
			break;
		}
		
		if(Branch!=null)
		{
			if (Branch.equals(br))
				return true;
			else 
				return false;
		}
		return false;
	}
}
