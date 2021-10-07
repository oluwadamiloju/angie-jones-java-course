package chapter10.fruits;

public class Mango extends Fruit{
    public Mango() {
        super(60);
    }

    public void peel() {
        System.out.println("Peeled mangoes for your enjoyment!");
    }

    @Override
    public void makeJuice() {
        System.out.println("Mango juice is made");
    }
}
