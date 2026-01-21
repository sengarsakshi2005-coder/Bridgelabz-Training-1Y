import java.util.Scanner;
class handshakes
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Number_of_students : ");
		int a = sc.nextInt();
		int b = (a * (a - 1))/2;
		System.out.println("Number_of_handshakes : "+b);
	}
}