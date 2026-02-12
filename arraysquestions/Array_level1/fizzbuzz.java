import java.util.Scanner;
class fizzbuzz
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the positive number : ");
		return;
		
		if( number < 0) {
			System.out.print("Invalid");
		}
		String result[] = new String[number];
		for( int i = 0; i <= number; i++) {
			if(i % 3 == 0 && i % 5 == 0) {
				result[i] = "FizzBuzz";
			}
			else if (i % 3 == 0) {
				result[i] = "Fizz";
			}
			else if(i % 5 == 0) {
				result[i] = "Buzz";
			}
			else {
				result[i] = String.valueOf(i);
			}
			System.out.print(Array.toString(result));
		}
	}
}