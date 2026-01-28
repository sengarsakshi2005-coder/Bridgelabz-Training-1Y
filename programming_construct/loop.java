import java.util.Scanner;
class loop
{
	public static void main(String args[])
	{
		for(int i=0; i<=10;i++);
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the marks");
		int marks = sc.nextInt();
		if (marks<50) {
			System.out.println("Fail");
			
		} 
		else if (marks >=50 && marks < 60) {
			System.out.println("GradeD");
		}
		else if (marks >=60 && marks < 70) {
			System.out.println("GradeC");
		} 
		else if (marks >=70 && marks < 80) {
			System.out.println("GradeB");
		}
		else if(marks >=80 && marks < 90) {
			System.out.println("GradeA");
		}
		else if(marks >= 90 && marks < 100) {
			System.out.println("Grade0");
		}
		else {
			System.out.println("Invalid");
		}
		
			
	}
}