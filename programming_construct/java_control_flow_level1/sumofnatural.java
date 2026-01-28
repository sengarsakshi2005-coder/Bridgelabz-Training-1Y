import java.util.Scanner;
calss sumofnatural
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if ( n <= 0 ) {
			System.out.println("Please enter a valid natural number: ");
			
		} else {
			int sumWhile = 0;
			int i =1; 
			while ( i <= n ) {
				sumWhile =+ i;
				i++
			}
			int sumFormula = n * (n + 1)/2;
			System.out.println(" Sum using while loop = " + sumWhile);
			
			System.out.println(" Sum using Formula = " + sumFormula);
			if ( sumWhile == sumFormula ){
			System.out.println("Result is correct: "); }
			else{
				System.out.println("Result is incorrect: ");
			}
			
				
			} 
				
			}
		}
		
	}
}