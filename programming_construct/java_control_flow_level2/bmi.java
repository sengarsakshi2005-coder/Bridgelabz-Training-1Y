import java.util.Scanner;
class bmi
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter weight (in kg):");
		double weight = sc.nextDouble();
		System.out.print("Enter height(in cm):");
		double heightCm = sc.nextDouble();
		double heightM = heightCm / 100;
		double bmi = weight / (heightM * heightM);
		System.out.print("bMI = " + bmi);
		
		
		if ( bmi < 18.5) {
			
			System.out.println("weight status: underweight");
		} else if ( bmi < 25){
			
			System.out.println("weight status: normal");
		}
		else if ( bmi < 30) {
			
			System.out.println("weight status: overweight");
		
		} 
		 else {
			
			System.out.println("weight status: obese");
		}
	}
}