class University
{
	public static void main(String[]args)
	{
		int fee = 125000;
		double discountPercentage = 10;
		double discountAmount = (discountPercentage / 100) * fee;
		double discountedPrice = fee - discountAmount;
		System.out.println("Original Fee: INR " + fee);
		System.out.println("Discount Amount: INR " + discountAmount);
		System.out.println("Amount to Pay after Discount: INR " + discountedPrice);
	
	}
}