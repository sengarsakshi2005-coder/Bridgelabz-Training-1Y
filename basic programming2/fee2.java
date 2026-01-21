import java.util.Scanner;
class fee2
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter_your_fee : ");
		int a = sc.nextInt();
		system.out.print("Enter_discount_to_be_applied : ");
	   
		int b = sc.nextInt();
		double c = a/100 * b;
		System.out.println(" Discount_fee : "+c);
		double d = a - c;
		System.out.println("Fee_after_discount : "+d);
	}
}