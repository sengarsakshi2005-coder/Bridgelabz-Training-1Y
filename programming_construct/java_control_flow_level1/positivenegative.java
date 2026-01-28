import java.util.Scanner;
class positivenegative
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		if (number >= 0){
			System.out.println("Number is positive");
		}
		else if (number <= 0){
			System.out.println("Number is negative");
		}
		else if(number == 0) {
			System.out.println("Number is zero");
		}
		else {
			System.out.println("Invalid");
		}
	}
}