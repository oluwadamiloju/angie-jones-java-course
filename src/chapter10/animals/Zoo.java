package chapter10.animals;

public class Zoo {
    public static void main(String[] args) {
        Dog maxi = new Dog();
        maxi.fetch();
        maxi.makeSound();
        feed(maxi);

        Animal recca = new Dog();
        recca.makeSound();
        feed(recca);

        recca = new Cat();
        recca.makeSound();
        ((Cat) recca).scratch();
        feed(recca);
    }

    public static void feed(Animal animal){
        if(animal instanceof Dog) {
            System.out.println("Here's your dog's food");
        }
        if(animal instanceof Cat) {
            System.out.println("Here's your cat's food");
        }
    }
}
