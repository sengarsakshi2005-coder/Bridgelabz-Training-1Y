import java.util.Scanner;
class harry
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Birth_year: ");
		int a = sc.nextInt();
		System.out.print("Current_year : ");
		int b = sc.nextInt();
		int age = b - a;
		System.out.println("Age : "+age);
    }
}
	