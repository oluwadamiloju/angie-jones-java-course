package chapter3;

/*
 * NESTED IFS:
 * To qualify for a loan, a person must make at least $30,000
 * and have been working at their current job for at least 2 years.
 */

import java.util.Scanner;

public class LoanQualifier {
    public static void main(String[] args) {
        //initialize what we know
        int requiredSalary = 30000;
        int requiredYearsEmployed = 2;

        //get what we don't
        //ask for salary
        System.out.println("Enter the salary you earn:");
        Scanner scanner = new Scanner(System.in);
        double salary = scanner.nextDouble();

        //ask for number of year at job
        System.out.println("Enter your years of experience with your current employer:");
        int experience = scanner.nextInt();
        scanner.close();

        //evaluate and output result
        if(salary >= requiredSalary) {
            if(experience >= requiredYearsEmployed) {
                System.out.println("Congrats! You qualify for a loan");
            } else {
                System.out.println("Sorry, you must have worked at your current job " +
                        requiredYearsEmployed + " years.");
            }
        } else {
            System.out.println("Sorry, you must earn at least $" + requiredSalary +
                    " to qualify for a loan");
        }
    }
}
