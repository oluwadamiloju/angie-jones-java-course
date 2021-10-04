package chapter3;

/*
 * IF-ELSE-IF
 * Display the letter grade for a student based on their test score.
 */

import java.util.Scanner;

public class TestResults {
    public static void main(String[] args) {
        //get test score
        System.out.println("Enter student's test score:");
        Scanner scanner = new Scanner(System.in);
        double score = scanner.nextDouble();
        scanner.close();

        //determine letter grade
        char grade;
        if(score < 60) {
            grade = 'F';
        } else if(score < 70) {
            grade = 'D';
        } else if(score < 80) {
            grade = 'C';
        } else if(score < 90) {
            grade = 'B';
        } else
            grade = 'A';

        System.out.println("Your grade is " + grade);
    }
}
