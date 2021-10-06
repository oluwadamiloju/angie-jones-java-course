package chapter7;

/*
Make an array that holds the textual values of the days of the week
Have a user input a number corresponding to the day of the week. Assume the week starts on Monday
Your program should output the String that represents the day of the week.
Example: User inputs the number 1, your program should print "Monday"
 */

import java.util.Scanner;

public class DayOfTheWeek {
    private static final String[] daysOfTheWeek = {
            "Monday",
            "Tuesday",
            "Wednesday",
            "Thursday",
            "Friday",
            "Saturday",
            "Sunday"
    };

    public static int getUserChoice() {
        System.out.println("Enter a number between 1 and 7");
        Scanner input = new Scanner(System.in);
        int userNumber = input.nextInt();
        if(userNumber < 1 || userNumber > 7) {
            return 0;
        } else return userNumber;
    }

    public static void main(String[] args) {
        int number = getUserChoice();
        System.out.println("Day of the week: " + daysOfTheWeek[number - 1]);
    }

}
