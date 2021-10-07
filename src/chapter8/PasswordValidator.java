package chapter8;

/*
Validate the complexity of a proposed password by assuring it meets these rules:
- at least 8 characters long
- contains an uppercase letter
- contain a special character
- not contain the username
- not the same as the old password
 */

import java.util.Scanner;

public class PasswordValidator {
    public static int lengthChecker(String password) {
        var words = password.split("");
        return words.length;
    }

    public static boolean containsUpperCase(String password) {
        return !password.equals(password.toLowerCase());
    }

    public static boolean containsSpecialCharacter(String password) {
        return !password.matches("[^A-Za-z0-9]");
    }

    public static boolean containsUsername(String password, String username) {
        return !password.contains(username);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Change your password here");

        System.out.println("Enter your username:");
        String username = scanner.nextLine();

        System.out.println("Enter old password:");
        String oldPassword = scanner.nextLine();

        System.out.println("""
                Enter your new password. It should:
                - be at least 8 characters long
                - contain an uppercase letter
                - contain a special character
                - not contain your username
                - not be the same as your old password
                """);

        String password = scanner.nextLine();

        int passwordLength = lengthChecker(password);
        if (passwordLength >= 8) {
            if(containsUpperCase(password) && containsSpecialCharacter(password)){
                if(containsUsername(password, username)) {
                    if(!(password.equals(oldPassword))) {
                        System.out.println("New password confirmed");
                    } else {
                        System.out.println("You entered your former password!");
                    }
                } else {
                    System.out.println("Your password contains your username! This is risky");
                }
            } else {
                System.out.println("Your password does not contain uppercase or special characters!");
            }
        } else {
            System.out.println("Enter a password that is at least 8 characters long!");
        }
    }
}
