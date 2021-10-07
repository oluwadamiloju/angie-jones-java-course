package chapter9.cake;

public class TasteTester {
    public static void main(String[] args) {
        Cake cake = new Cake("Lemon");
        BirthdayCake birthdayCake = new BirthdayCake();
        WeddingCake weddingCake = new WeddingCake();

        birthdayCake.setPrice(3999.99);
        weddingCake.setPrice(9999.99);

        System.out.println("This is a cake. \nFlavour: " + cake.getFlavour() + "\nPrice: N" + cake.getPrice());
        System.out.println("\nThis is a birthday cake. \nFlavour: " + birthdayCake.getFlavour() + "\nPrice: N" + birthdayCake.getPrice());
        System.out.println("\nThis is a wedding cake. \nFlavour: " + weddingCake.getFlavour() + "\n" + "Price: N" + weddingCake.getPrice());
    }
}
