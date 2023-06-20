package stackclass;
import java.util.*;
public class DemoStack {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Stack<Integer> st = new Stack<Integer>();
		while(true)
		{
			System.out.println("Choice: ");
			System.out.println("1.push\n2.Pop\n3.peek\n4.search\n5.disply\n6 exit");
			switch(sc.nextInt())
			{
			case 1:
				System.out.println("Enter an Integer to Push");
				st.push(sc.nextInt());
				break;
			case 2:
				System.out.println("The popped element is : "+st.pop());
				break;
			case 3:
				System.out.println("The Top Element: "+st.peek());
				break;
			case 4:
					if(st.empty())
						System.out.println("Stack is Empty");
					else {
						System.out.println("Enter an element to search");
						int temp = sc.nextInt();
						int pos = st.search(temp);
						if(pos>0)
						{
							System.out.println("Element present at: "+pos);
						}
						else
							System.out.println("Item No available");
					}
				break;
			case 5:
				System.out.println(st.toString());
				break;
			case 6:
				sc.close();
				System.exit(0);
				break;
			}
		}
	}
}
