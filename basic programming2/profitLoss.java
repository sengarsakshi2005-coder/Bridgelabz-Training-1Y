import java.util.Scanner;
class profitLoss

{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Cost_price : ");
		int a = sc.nextInt();
		System.out.print("Selling_price : ");
		int b = sc.nextInt();
		int profit = b - a;
		System.out.println("Profit : "+profit);
		double prf = profit*100/a;
		
		System.out.println("Profitbpercentage : "+prf);
		
		
		
    }
}