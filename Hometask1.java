
package marksheet;
import java.util.Scanner;
public class MarkSheet {
public static double calculatePercentage(double obtainedMarks, double totalMarks) {
        return (totalMarks > 0) ? (obtainedMarks / totalMarks) * 100 : 0;
    }

    public static String determineGrade(double percentage) {
        if (percentage >= 90) {
            return "A+";
        } else if (percentage >= 80) {
            return "A";
        } else if (percentage >= 70) {
            return "B";
        } else if (percentage >= 60) {
            return "C";
        } else if (percentage >= 50) {
            return "D";
        } else {
            return "F";
        }
    }

    public static double calculateGPA(String grade) {
        switch (grade) {
            case "A+":
            case "A":
                return 4.0;
            case "B":
                return 3.0;
            case "C":
                return 2.0;
            case "D":
                return 1.0;
            case "F":
                return 0.0;
            default:
                return 0.0;
        }
    }
    public static void printMarkSheet(String studentName, double totalMarks, double obtainedMarks) {
        double percentage = calculatePercentage(obtainedMarks, totalMarks);
        String grade = determineGrade(percentage);
        double gpa = calculateGPA(grade);

        System.out.println("\n--- Mark Sheet ---");
        System.out.println("Student Name: " + studentName);
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Obtained Marks: " + obtainedMarks);
        System.out.printf("Percentage: %.2f%%%n", percentage);
        System.out.println("Grade: " + grade);
        System.out.printf("GPA: %.2f%n", gpa);
        System.out.println("------------------");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter the student's name: ");
            String studentName = scanner.nextLine();

            System.out.print("Enter the total marks: ");
            double totalMarks = scanner.nextDouble();

            System.out.print("Enter the obtained marks: ");
            double obtainedMarks = scanner.nextDouble();

            if (obtainedMarks > totalMarks) {
                System.out.println("Obtained marks cannot be greater than total marks.");
                return;
            }

            printMarkSheet(studentName, totalMarks, obtainedMarks);

        } catch (Exception e) {
            System.out.println("Invalid input. Please enter numerical values for marks.");
        } finally {
            scanner.close();
        }
    }
}
    
    

