package chapter10.fruits;

public class Market {
    public static void main(String[] args) {
        Fruit apple = new Apple();
        apple.setCalories(52);
        System.out.println(apple.getCalories());
        apple.makeJuice();
        ((Apple) apple).removeSeeds();
        makeSmoothie(apple);

        apple = new Mango();
        ((Mango) apple).peel();
        makeSmoothie(apple);
    }

    public static void makeSmoothie(Fruit fruit) {
        if(fruit instanceof Apple) {
            System.out.println("Apple alone won't make a nice smoothie. Add a thickener");
        }
        if(fruit instanceof Mango) {
            System.out.println("Yum!");
        }
    }
}
