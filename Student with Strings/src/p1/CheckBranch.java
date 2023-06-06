package p1;

public class CheckBranch {
	private boolean flag = false;
	public boolean verify(String Br)
	{
		switch(Br)
		{
		case "CSE":
		case "ECE":
		case "EEE":
		case "MECH":
		case "CIVIL":
		case "AI":
			flag = true;
			break;
		}
		return flag;
	}
}
