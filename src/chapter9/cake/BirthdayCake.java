package chapter9.cake;

public class BirthdayCake extends Cake{
    private int candles;

    public BirthdayCake() {
        super("Mango sorbet");
    }

    public int getCandles() {
        return candles;
    }

    public void setCandles(int candles) {
        this.candles = candles;
    }
}
