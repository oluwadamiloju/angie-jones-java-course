package chapter2;

import java.util.Scanner;

public class MadLibs {
    public static void main(String[] args) {
//    1. Ask for season of the year
        System.out.println("Enter season of the year.");
        Scanner scanner = new Scanner(System.in);
        String season =  scanner.next();

//    2. Ask for a whole number
        System.out.println("Enter a whole number.");
        int number = scanner.nextInt();

//    3. Ask for an adjective
        System.out.println("Enter an adjective.");
        String adjective = scanner.next();
        scanner.close();

//    4. Display result
        System.out.println("\"On a " + adjective + " " + season + " day, I drink a minimum of " + number + " cups of coffee\"");

    }
}
