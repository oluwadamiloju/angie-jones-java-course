package chapter9.cake;

public class BirthdayCake extends Cake{
    private int candles;

    public BirthdayCake(String flavour) {
        super(flavour);
    }

    public int getCandles() {
        return candles;
    }

    public void setCandles(int candles) {
        this.candles = candles;
    }
}
