package chapter11.farm;

public abstract class Animal {
    abstract String makeSound();

    public void eat() {
        System.out.println("The animal is eating");
    }
}
