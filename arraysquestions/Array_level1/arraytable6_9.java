import java.util.Scanner;
class arraytable6_9 {
	public static void main(String[]args) {
		Scanner sc = new sc (System.in);
		System.out.print("Enter number (6 to 9): ");
		int number = sc.nextInt();
		if (number < 6 || number > 9) {
			System.out.println("Invalid input ! Enter number between 6 and 9.");
			return;
		}
		int []multiplicationResult = new int[10];
		for (int i = 1; i <= 10; i++) {
			multiplicationResult[i - 1] = num * i;
		}
		for (int i = 1; i <= 10; i++) {
			System.out.print(num + " * " + i + " = " + multiplicationResult[i-1] );
			
			
		}
	}
}