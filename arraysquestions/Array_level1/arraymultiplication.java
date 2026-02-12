import java.util.Scanner;
class arraymultiplication {
	public static void main(String[]args) {
		Scanner sc = new sc (System.in);
		System.out.print("Enter number: ");
		int num = sc.nextInt();
		int []table = new int[10];
		for (int i = 1; i <= 10; i++) {
			table[i - 1] = num * i;
		}
		for (int i = 1; i <= 10; i++) {
			System.out.print(num + " * " + i + " = " + table[i-1] );
			
			
		}
	}
}