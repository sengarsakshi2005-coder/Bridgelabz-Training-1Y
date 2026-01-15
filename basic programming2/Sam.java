import java.util.Scanner;
class Sam 
{
	public static void main(String[]args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter your maths marks:");
		int maths= sc.nextInt();
		System.out.println("Enter your physics marks:");
		int physics= sc.nextInt();
		System.out.println("Enter your chemistry marks:");
		int chemistry= sc.nextInt();
		int average= (maths+physics+chemistry)/3;
		System.out.println("average is:" +average);
		sc.close();
	}
}