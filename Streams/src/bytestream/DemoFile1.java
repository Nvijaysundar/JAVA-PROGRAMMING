package bytestream;
import java.util.*;
import java.io.*;
public class DemoFile1 {

	public static void main(String[] args) {
		//try with resources
		try(Scanner sc = new Scanner(System.in);)
		{
			try {
				System.out.println("Enter the fpath & Fname(Source)");
				FileInputStream fis = new FileInputStream(sc.nextLine());
				System.out.println("Enter The Fpath & Fname(Destination)");
				FileOutputStream fos = new FileOutputStream(sc.nextLine());
				int k;
				while((k=fis.read())!=1)
				{
					fos.write(k);
				}
				System.out.println("File Copied Succesfull");
				fos.close();
				fis.close();
			}
			catch(FileNotFoundException ob)
			{
				System.out.println("Invlid file location");
			}
			catch(IOException ob)
			{
				ob.printStackTrace();
			}
		}
	}

}
