package chapter4;

import java.util.Random;

public class RollTheDiceGame {
    public static void main(String[] args) {
        //welcome message
        System.out.println("Welcome to roll the dice game. There are 20 spaces, try to get to the last" +
                " space in 5 die rolls!");

        //initialize known variables
        int currentSpace = 0;
        int lastSpace = 20;
        int numberOfRolls = 5;

        //generate random number
        Random random = new Random();

        //game process
        for (int i = 1; i <= numberOfRolls; i++) {
            int dieFace = random.nextInt(6) + 1;
            currentSpace += dieFace;

            if(currentSpace == lastSpace) {
                System.out.println("You have won!");
                break;
            } else if(currentSpace > lastSpace) {
                System.out.println("You passed the total number of spaces. You lose!");
                break;
            } else if(i == numberOfRolls  && currentSpace < lastSpace) {
                System.out.println("You didn't make it in time. You lose!");
                break;
            } else {
                System.out.println("Roll #" + i + ". You rolled a " + dieFace + ". You are now on " +
                        "space " + currentSpace + " and have " + (lastSpace - currentSpace) + " more to go!");
            }
        }
    }
}
