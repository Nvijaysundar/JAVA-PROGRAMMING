package demoBlocks;

public class Blocksdemo {
	static {
		System.out.println("This is Static Block");
	}
	
	{
		System.out.println("This is Instance block");
	}
	
	public static void main(String[] args) {
		System.out.println("Hello");
		
		new Blocksdemo();
		System.out.println("World");
	}
}	
