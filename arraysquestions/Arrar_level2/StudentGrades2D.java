 import java.util.Scanner;

public class StudentGrades2D {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        double[][] marks = new double[n][3]; 
        double[] percentage = new double[n];
        char[] grade = new char[n];

        
        for (int i = 0; i < n; i++) {

            System.out.println("\nStudent " + (i + 1));

            System.out.print("Physics: ");
            marks[i][0] = sc.nextDouble();

            System.out.print("Chemistry: ");
            marks[i][1] = sc.nextDouble();

            System.out.print("Maths: ");
            marks[i][2] = sc.nextDouble();
        }

        
        for (int i = 0; i < n; i++) {

            double total = 0;

            for (int j = 0; j < 3; j++)
                total += marks[i][j];

            percentage[i] = total / 3;

            if (percentage[i] >= 80)
                grade[i] = 'A';
            else if (percentage[i] >= 70)
                grade[i] = 'B';
            else if (percentage[i] >= 60)
                grade[i] = 'C';
            else if (percentage[i] >= 50)
                grade[i] = 'D';
            else if (percentage[i] >= 40)
                grade[i] = 'E';
            else
                grade[i] = 'R';
        }

        
        System.out.println("\n--- Result ---");

        for (int i = 0; i < n; i++) {
            System.out.println("Student " + (i + 1) +
                    " | Percentage: " + String.format("%.2f", percentage[i]) +
                    "% | Grade: " + grade[i]);
        }

        sc.close();
    }
}