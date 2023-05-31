class Totsal {
	public static void main(String args[])
	{
		int bsal = 12500;
		float hra,ta,tsal;
		hra = 	0.15f * bsal;
		ta = 0.17f * bsal;
		tsal = bsal + hra + ta;
		System.out.println("Total Salary: "+tsal+"/-");
		System.out.printf("Total Salary: %.2f/-",tsal);
	}
}