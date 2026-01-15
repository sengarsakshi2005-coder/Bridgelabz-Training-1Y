import java.util.Scanner;
class Pens
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter numer of pens:");
		int totalpens = sc.nextInt();
		System.out.println("Enter number of student:");
		int totalstudents = sc.nextInt();
		int PensPerPerson = totalPens / totalstudents;
		int remainingPens = totalPens % totalstudents;
		System.out.println("the pen per person is " + pensPerPerson + " and the remaining pen not distribuited is " + remainingPens);
	}
}