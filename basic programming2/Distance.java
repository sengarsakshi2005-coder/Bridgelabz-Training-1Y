import java.util.Scanner;
class Distance
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter distance in km:");
		double km= sc.nextDouble();
		double miles= km * 1.6;
		System.out.println("the distance" + km + "km in miles is" + miles);
		
	}
	
}