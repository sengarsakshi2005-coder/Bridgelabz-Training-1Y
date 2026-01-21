import java.util.Scanner;
class feet_to_yard_to_mile
{
	public Static void main(String[]args)
	{
		Scanner sc =new Scanner(System.in);
		System.out.print("Distance(in feet) : ");
		int a = sc.nextInt();
		double b = a/3.0;
		double c = b/1760.0;
		System.out.println("Distance(in yards) : "+b);
		System.out.println("Distance(in miles) : "+c);
	}
}















