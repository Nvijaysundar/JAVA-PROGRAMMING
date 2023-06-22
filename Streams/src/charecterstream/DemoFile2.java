package charecterstream;
import java.io.*;
import java.util.*;
public class DemoFile2 {
	public static void main(String[] args) {
		try {
			InputStreamReader isr  = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(isr);
			FileWriter fw = new FileWriter("C:\\Users\\vijay\\OneDrive\\Desktop"
					+ "\\EXPLORE\\HTMLCSSJS\\newText.txt");
			
			char ch;
			System.out.println("Provide Inputs: to Stop give @");
			while((ch=(char)br.read())!='@')
			{
				fw.write(ch);
			}
			fw.close();
			System.out.println("Data Stored Successfully");
			
			System.out.println("Display data: ");
			FileReader fr = new FileReader("C:\\Users\\vijay\\OneDrive\\Desktop"
					+ "\\EXPLORE\\HTMLCSSJS\\newText.txt");
			int k;
			
			while((k=fr.read())!=-1)
			{
				System.out.print((char)k);
			}
			fr.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
