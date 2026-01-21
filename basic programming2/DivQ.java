import java.util.Scanner;
claas DivQ
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("First_number : ");
		int a = sc.nextInt();
		System.out.print("Second_number : ");
		int b = sc.nextInt();
		System.out.println("Remainder : " +(a%b));
	
		System.out.println("Quotient :  "+(a/b));
	}
}