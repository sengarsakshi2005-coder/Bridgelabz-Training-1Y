import java.util.Scanner;
class triangle
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Base_of_triangle(in cm) : ");
		int a = sc.nextInt();
		System.out.print("Height_of_triangle(in cm) : ");
		int b = sc.nextInt();
		double ar = 1/2.0 * a * b;
		System.out.println("Area(in cm ) :  "+ar);
		System.out.println("Area (in inch) :  "+(ar * 1/2.54 * 1/2.54)); 
	}
}