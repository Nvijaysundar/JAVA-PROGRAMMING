package checkedexception;

public class TestCustom {
	static void validate(int age) throws InvalidAgeException {
		if(age<18)
			throw new InvalidAgeException("Not Eligible");
		else
			System.out.println("Eligible for Voting");
	}
	public static void main(String[] args) {
		try
		{
			validate(17);
		}
		catch(InvalidAgeException ex)
		{
			ex.printStackTrace();
			
			System.out.println("\n"+ex.toString());
		}	
	}
}
