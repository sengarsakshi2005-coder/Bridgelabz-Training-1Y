import java.util.Scanner;
class grade
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the physics marks:");
		int phy = sc.nextInt();
		System.out.print("Enter the chemistry marks:");
		int chem = sc.nextInt();
		System.out.print("Enter the maths marks:");
		int maths = sc.nextInt();
		double average = ( phy + chem + maths) / 3.0;
		System.out.println("Avearge marks = " + average);
		if ( average >= 80 ) {
			System.out.println("Grade: A");
			System.out.println("Remarks: Level 4, above agency-normalized standards");
		} else if ( average >= 70){
			System.out.println("Grade: B");
			System.out.println("Remarks: Level 3, above agency-normalized standards");
		}
		else if ( average >= 60) {
			System.out.println("Grade: C");
			System.out.println("Remarks: Level 2, above agency-normalized standards");
		
		} 
		else if ( average >= 50) {
			System.out.println("Grade: D" );
			System.out.println("Remarks: Level 1, above agency-normalized standards");
		}
		else if ( average >= 40) {
			System.out.println("Grade: E" );
			System.out.println("Remarks: too low, well below standards");
			
		
			
		} else {
			System.out.println("Grade: R" );
			System.out.println("Remarks: Remedial standards");
		}
	}
}