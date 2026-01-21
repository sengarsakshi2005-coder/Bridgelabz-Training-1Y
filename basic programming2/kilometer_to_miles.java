import java.util.Scanner;
class kilometer_to_miles

{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Distance(in_km): ");
		int a = sc.nextInt();
		double b = a * 1.6;
		System.out.println("Distance(in miles) : "+b);
		
		
		
    }
}