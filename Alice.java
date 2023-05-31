class Alice{

	public static void main(String args[])
	{
		int p = 100, t = 10;
		float r = 1f;
		
		float interst= (p*t*r)/100.0f;
		float tamt = p + interst;
		float discount = 0.02f * interst;
		float finalamt = tamt - discount;
	
		System.out.printf("Interst : %.2f\n",interst);
		System.out.printf("Amount : %.2f\n",tamt);
		System.out.printf("Discount : %.2f\n",discount);
		System.out.printf("Total Amount : %.2f",finalamt);
	}
}