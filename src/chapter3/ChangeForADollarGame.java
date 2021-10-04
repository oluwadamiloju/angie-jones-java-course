package chapter3;

/*
The objective of this game is to enter enough change to equal exactly $1! Create a program that
asks a user to enter the quantities for the following coins: pennies, nickels, dimes and quarters.
Your program should count up the value of all the change. If it's exactly $1, they win! If it's
more than $1, tell them by how much they went over. If it's less than $1, tell them by how much
they went under. Feel free to change the game for your country's currency!
 */

import java.util.Scanner;

import static java.lang.Math.abs;

public class ChangeForADollarGame {
    public static void main(String[] args) {
        //ask user to input information we don't have
        System.out.println("How many pennies would you like?");
        Scanner scanner = new Scanner(System.in);
        int pennies = scanner.nextInt();

        System.out.println("How many nickels would you like?");
        int nickels = scanner.nextInt();

        System.out.println("How many dimes would you like?");
        int dimes = scanner.nextInt();

        System.out.println("How many quarters would you like?");
        int quarters = scanner.nextInt();

        int dollar = 1;
        double totalMoney = quarters * 0.25 + (dimes * 0.1) + (nickels * 0.05) + (pennies * 0.01);
        float change = (float) abs(dollar - totalMoney);

        if(totalMoney == dollar) {
            System.out.println("Congrats! You win!");
        } else if(totalMoney > dollar) {
            System.out.println("You surpassed a dollar by $" + change);
        } else {
            System.out.println("You were under a dollar by $" + change);
        }
    }
}
