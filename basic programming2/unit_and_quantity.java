import java.util.Scanner;
class unit_and_quantity
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Unit_price : ");
		int a = sc.nextInt();
		System.out.print("Quantity : ");
		int b = sc.nextInt();
		System.out.println("Total_price : "+(a * b));
	}
}