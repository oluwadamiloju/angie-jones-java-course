package chapter9.cake;

public class WeddingCake extends Cake {
    private int tiers;

    public WeddingCake(String flavour) {
        super(flavour);
    }

    public int getTiers() {
        return tiers;
    }

    public void setTiers(int tiers) {
        this.tiers = tiers;
    }
}
