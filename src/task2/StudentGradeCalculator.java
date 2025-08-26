package task2;
import java.util.Scanner;
import java.util.*;
public class StudentGradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Total Number of Subject :");
        int numSujects=sc.nextInt();

        int totalmarks =0;

        for(int i=1;i<=numSujects; i++) {
            System.out.println("Enter marks of subject " + i + " (out of 100) ");
            int marks = sc.nextInt();
            totalmarks += marks;
        }
        double averagePercentage =(double) totalmarks/numSujects;
        char grade;
        if (averagePercentage >= 90) {
            grade = 'A';
        } else if (averagePercentage >= 80) {
            grade = 'B';
        } else if (averagePercentage >= 70) {
            grade = 'C';
        } else if (averagePercentage >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }
        System.out.println("--- YOUR RESULT ---");
        System.out.println("Total Marks Obtained: " + totalmarks);
        System.out.printf("Average Percentage: %.2f%%\n", averagePercentage);
        System.out.println("Grade: " + grade);

    }

}
