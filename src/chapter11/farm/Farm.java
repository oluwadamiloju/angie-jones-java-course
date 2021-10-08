package chapter11.farm;

public class Farm {
    public static void main(String[] args) {
        Animal pig = new Pig("oink");
        pig.eat();
        System.out.println(pig.makeSound());

        Animal duck = new Duck("quack");
        duck.eat();
        System.out.println(duck.makeSound());
    }
}
