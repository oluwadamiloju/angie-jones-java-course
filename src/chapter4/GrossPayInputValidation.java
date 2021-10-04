package chapter4;

/*
 * WHILE LOOP:
 * Each store employee makes $15 an hour. Write a program that allows the employee
 * to enter the number of hours worked for the week. Do not allow overtime.
 */

import java.util.Scanner;

public class GrossPayInputValidation {
    public static void main(String[] args) {
        //initialize known variables
        int rate = 15;
        int maxHours = 40;

        //get unknown variables
        System.out.println("How many hoursWorked did you work this week?");
        Scanner scanner = new Scanner(System.in);
        double hoursWorked = scanner.nextDouble();

        //validate input
        while(hoursWorked > maxHours || hoursWorked < 1) {
            System.out.println("Invalid entry. Your hoursWorked must be between 1 and 40. Try again.");
            hoursWorked = scanner.nextDouble();
        }
        scanner.close();

        //calculate gross
        double gross = rate * hoursWorked;
        System.out.println("Gross pay: $" + gross);
    }
}
