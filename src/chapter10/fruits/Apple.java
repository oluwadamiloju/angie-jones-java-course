package chapter10.fruits;

public class Apple extends Fruit{
    public Apple() {
        super(52);
    }

    public void removeSeeds() {
        System.out.println("Seeds have been removed!");
    }

    @Override
    public void makeJuice() {
        System.out.println("Apple juice is better than orange juice!");
    }
}
