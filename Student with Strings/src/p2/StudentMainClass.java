package p2;
import p1.*;
import java.util.Scanner;

public class StudentMainClass {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Name: ");
		String Name = sc.nextLine();
		
		System.out.println("Enter Branch: ");
		String Br = sc.nextLine().toUpperCase().trim();
		CheckBranch cb = new CheckBranch();
		if(cb.verify(Br))
		{
			System.out.println("Enter Rollno:");
			String Rollno = sc.nextLine().toUpperCase().trim();
			if(Rollno.length()==10)
			{
				ValidateRollwithBranch vb = new ValidateRollwithBranch();
				if(vb.validate(Br,Rollno.substring(6, 8)))
				{
					int sum=0,sub;
					boolean res = true;
					for(int i=1;i<=6;i++)
					{
						System.out.print("Enter Sub"+i+" Marks: ");
						sub = sc.nextInt();
						sum += sub;
						if(sub<40)
							res = false;
					}
					StudentResult sr = new StudentResult();
					String result = sr.generateresult(sum/6.0f,res);
					System.out.println("Name: "+Name);
					System.out.println("ROLLNO: "+Rollno);;
					System.out.println("Branch: "+Br);
					System.out.println("Percentage: "+sum/6.0f);
					System.out.println("Result: "+result);
				}
				else
				{
					System.out.println("Branch Doesn't Match");
				}
			}
			else
				System.out.println("Invalid Rollno");
		}
		else
			System.out.println("Invalid Branch");
		
		sc.close();
	}
}
