package chapter4;

import java.util.Scanner;

public class AddNumbers {
    public static void main(String[] args) {
        boolean again;
        Scanner scanner = new Scanner(System.in);

        do {
//        prompt the user to enter their first number
            System.out.println("Enter the first number you want to add:");
            double firstNumber = scanner.nextDouble();

//        then prompt them to enter the second number
            System.out.println("Enter the second number you want to add:");
            double secondNumber = scanner.nextDouble();

//        add those numbers up
            double sum = firstNumber + secondNumber;
            System.out.println("The sum is " + sum);

//        then ask them if they’d like to do another calculation
            System.out.println("Do you want to perform another calculation? enter true or false");
            again = scanner.nextBoolean();
        } while (again);
        scanner.close();
    }
}
