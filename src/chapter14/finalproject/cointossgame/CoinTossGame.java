package chapter14.finalproject.cointossgame;

import java.util.Scanner;

public class CoinTossGame {
    public static void main(String[] args) {
        Player player1 = new Player("Sarah");
        Player player2 = new Player("Oluwadamiloju");

        System.out.println("Player 1: Head or tail");
        Scanner scanner =  new Scanner(System.in);
        String guess = scanner.next();
        if(guess.equalsIgnoreCase(Coin.HEAD) || guess.equalsIgnoreCase(Coin.TAIL)) player1.setGuess(guess);

        if(player1.getGuess().equalsIgnoreCase(Coin.HEAD)) player2.setGuess(Coin.TAIL);
        else player2.setGuess(Coin.HEAD);

        Coin coin = new Coin();
        String gameFlip = coin.flip();
        if (gameFlip.equals(player1.getGuess())) {
            System.out.println(player1.getGuess() + "! Player 1 wins!");
        } else {
            System.out.println(player2.getGuess() + "! Player 2 wins!");
        }
    }
}
