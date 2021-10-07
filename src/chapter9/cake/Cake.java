package chapter9.cake;

public class Cake {
    private String flavour;
    private double price;

    public Cake(String flavour) {
        this.flavour = flavour;
        this.price = 1999.99;
    }

    public String getFlavour() {
        return flavour;
    }

    public void setFlavour(String flavour) {
        this.flavour = flavour;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
