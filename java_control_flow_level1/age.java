import java.util.Scanner;
class age
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		if (age < 18){
			System.out.println("The person can not vote");
		}
		else if (age >= 18){
			System.out.println("The person can vote");
		}
		else {
			System.out.println("Invalid");
		}
	}
}