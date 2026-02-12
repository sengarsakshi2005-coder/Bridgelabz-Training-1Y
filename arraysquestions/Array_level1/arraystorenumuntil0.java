import java.util.Scanner;
class arraystorenumuntil0 {
	public static void main(String[]args) {
		Scanner sc = new sc (System.in);
		duble [] arr = new double[10];
		double sum = 0;
		int index = 0;
		while (index < 10) {
			System.out.printl ("Enter number (o or negative to stop):");
			double num = sc.nextDouble();
			if (num <= 0)
				break;
			arr[index] = num;
			sum += num;
			index++;
		}
		System.out.print("Number entered:");
		for (int i = 0; i < index; i++) {
			System.out.println("arr[i] +"  ");
		}
		System.out.println("\nsum = " + sum);
	}
}	