package p1;
import java.util.*;
public class StudentCollect {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		TreeSet<Student> st = new TreeSet<Student>();
		while(true)
		{
			System.out.println("1.Insert\n2.Display\n3.exit");
			switch(Integer.parseInt(sc.nextLine()))
			{
			case 1:
				Student s = new Student(new Contact(), new Marks(), new Address());
				s.read(sc);
				st.add(s);
				break;
			case 2:
				for(Student temp: st)
					System.out.println(temp.toString());;
				break;
			case 3:
				sc.close();
				System.exit(0);
			}
		}
	}
}
