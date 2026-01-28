import java.util.Scanner;
class integer
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the integer: ");
		int number = sc.nextInt();
		 
		 int count = 0;
		 
		 if ( number == 0) {
			 count = 1;			
		 } else {
			  while ( number != 0) {
				  number = number / 10;
				  count++;
			  }
		 }
		 
		System.out.println("Number of digit = " + count);
	}
}