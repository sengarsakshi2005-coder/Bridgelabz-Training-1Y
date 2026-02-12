import java.util.Scanner;
class arrayevenodd {
	public static void main(String[]args) {
		Scanner sc = new sc (System.in);
		System.out.println("Enter a natural number:");
		int number = sc.nextInt();
		if (number <= 0) {
			System.out.println("Error! Enter a natural number.");
			return;
		}
		int size = number / 2+1;
		int [] even = new int[size];
		int []odd = new int[size];
		int evenIndex = 0, oddIndex = 0;
		for (int i = 1; i <= number; i++) {
			if (i % 2 == 0) {
				even[evenIndex++] = i;
			} else {
				odd[oddIndex++] = i;
			}
			
		}
		System.out.println("Odd number:");
		for (int i = 0; i < OddIndex; i++) {
			
				System.out.println("Odd[i] + " ")
				}
				System.out.print("\nEven number:");
				for (int i = 0; i < evenIndex; i++){
					System.out.println("even[i] + " ");
				}
				
		}
	
	
}