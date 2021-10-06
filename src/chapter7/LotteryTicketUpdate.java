package chapter7;

import java.util.Arrays;
import java.util.Random;

public class LotteryTicketUpdate {
    private static final int LENGTH = 6;
    private static final int MAX_TICKET_NUMBER = 69;

    public static int[] generateNumbers() {
        int[] ticket = new int[LENGTH];
        Random random = new Random();

        for (int i = 0; i < LENGTH; i++) {
            int randomNumber;

            /*
            Generate random number then search to make sure it
            doesn't already exist in the array. If it does, regenerate and search again.
            */

            do {
                randomNumber = random.nextInt(MAX_TICKET_NUMBER) + 1;
            }while (search(ticket, randomNumber));

            ticket[i] = randomNumber;
        }

        return ticket;
    }

/**
 * Does a sequential search on the array to find a value
 * @param array Array to search through
 * @param numberToSearchFor Value to search for
 * @return true if found, false if not
 */

    private static boolean search(int[] array, int numberToSearchFor) {
        for(int value : array) {
            if(value == numberToSearchFor) {
                return true;
            }
        }
        /*
        If we've reached this point, then the entire array was searched
        and the value was not found
        */
        return false;
    }

///**
//* Does a binary search on the array to find a value
//* @param array Array to search through
//* @param numberToSearchFor Value to search for
//* @return true if found, false if not
//*/
//
//    private static boolean binarySearch(int[] array, int numberToSearchFor) {
//        //sort array first
//        Arrays.sort(array);
//        int index = Arrays.binarySearch(array, numberToSearchFor);
//        if(index >= 0){
//            return true;
//        }
//        else return false;
//    }

    public static void printTicket(int[] ticket) {
        for (int j : ticket) {
            System.out.print(j + " | ");
        }
    }

    public static void main(String[] args) {
        int[] ticket = generateNumbers();
        Arrays.sort(ticket);
        printTicket(ticket);
    }
}
