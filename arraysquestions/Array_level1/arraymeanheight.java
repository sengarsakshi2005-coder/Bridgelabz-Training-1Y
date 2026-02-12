import java.util.Scanner;
class arraymeanheight {
	public static void main(String[]args) {
		Scanner sc = new sc (System.in);
		duble [] heights = new double[10];
		double sum = 0;
		
		
		
		for (int i = 0; i < height.lenght; i++) {
			System.out.println("Enter height of player " + (i + 1)+ ":  ");
			height[i] = sc.nextDouble();
			sum += height[i];
		}
		double mean = sum / height.lenght;
		System.out.println("Mean height of the football team = " + mean);
	}
}	