package chapter9.cake;

public class WeddingCake extends Cake {
    private int tiers;

    public WeddingCake() {
        super("Carrot cheesecake");
    }

    public int getTiers() {
        return tiers;
    }

    public void setTiers(int tiers) {
        this.tiers = tiers;
    }
}
