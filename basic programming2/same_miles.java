import java.util.Scanner;
class same_miles

{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Distance(in yards: ");
		int a = sc.nextInt();
		System.out.print("Selling_price : ");
		double b = a/3.0;
		double c = b/1760;
		System.out.println("Distance(in feet) : "+b);
		
		System.out.println("Distance(in yards) : "+c);
		
		
		
    }
}