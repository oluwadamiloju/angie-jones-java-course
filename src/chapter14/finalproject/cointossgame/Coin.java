package chapter14.finalproject.cointossgame;

import java.util.Random;

public class Coin {
    private String side;
    private static final String HEAD = "Head";
    private static final String TAIL = "Tail";

    public String getSide() {
        return side;
    }

    public void setSide(String side) {
        this.side = side;
    }

    public String flip() {
        Random random = new Random();
        int sideChooser = random.nextInt(2) + 1;
        if(sideChooser == 1) {
            side = HEAD;
        } else side = TAIL;

        return side;
    }
}
