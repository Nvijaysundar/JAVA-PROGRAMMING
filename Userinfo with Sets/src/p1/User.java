package p1;

import java.util.*;

public class User implements Comparable<User> {
	String UserName,Password;
	
	
	public User(String userName, String password) {
		UserName = userName;
		Password = password;
	}

	@Override
	public String toString() {
		return "User [UserName=" + UserName + ", Password=" + Password + "]";
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("1.HashSet\n2.LinkedHashSet\n3.TreeSet");
		Set<User> s = null;
		switch(Integer.parseInt(sc.nextLine()))
		{
		case 1:
			s = new HashSet<User>();
			break;
		case 2:
			s = new LinkedHashSet<User>();
			break;
		case 3:
			s = new TreeSet<User>();
			break;
		}
		for(int i=1;i<=3;i++)
		{
			System.out.println("Enter Details odf Student "+i+": ");
			System.out.println("Enter Name: ");
			String name = sc.nextLine();
			System.out.println("Enter Password: ");
			String Pass = sc.nextLine();
			s.add(new User(name,Pass));
		}
		
		for(User temp: s)
			System.out.println(temp.toString());
	}

	@Override
	public int compareTo(User o) {
		if (UserName.compareTo(o.UserName)==0)
			return 0;
		else if (UserName.compareTo(o.UserName)>0)
			return 1;
		return -1;
	}
	
}
