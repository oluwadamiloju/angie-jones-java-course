package chapter12;

import java.util.*;

public class CollectionDemonstration {
    public static void main(String[] args) {
        Set fruits = new HashSet();
        fruits.add("apple");
        fruits.add("lemon");
        fruits.add("banana");
        fruits.add("orange");
        fruits.add("lemon");

        System.out.println(fruits.size());
        System.out.println(fruits);
        System.out.println();

        List fruitBasket = new ArrayList();
        fruitBasket.add("apple");
        fruitBasket.add("lemon");
        fruitBasket.add("banana");
        fruitBasket.add("orange");
        fruitBasket.add("lemon");

        System.out.println(fruitBasket.get(1));
        System.out.println(fruitBasket.size());
        System.out.println(fruitBasket);
        System.out.println();

        Queue fruit = new LinkedList();
        fruit.add("apple");
        fruit.add("lemon");
        fruit.add("banana");
        fruit.add("orange");
        fruit.add("lemon");

        System.out.println(fruit.size());
        System.out.println(fruit);

        fruit.remove();
        System.out.println(fruit);
        System.out.println(fruit.peek());
        System.out.println();

        Map fruitCalories = new HashMap();
        fruitCalories.put("apple", 95);
        fruitCalories.put("lemon", 20);
        fruitCalories.put("banana", 105);
        fruitCalories.put("orange", 45);
        fruitCalories.put("lemon", 17);

        System.out.println(fruitCalories.size());
        System.out.println(fruitCalories);
        System.out.println(fruitCalories.get("lemon"));
        System.out.println(fruitCalories.entrySet());
        fruitCalories.remove("orange");
        System.out.println(fruitCalories);
        System.out.println();

        List unchangeableList = List.of("apple, lemon, banana"); //comes with a cost. creates immutable collection
        unchangeableList.add("orange"); //will throw unsupportedOperationException
        unchangeableList.remove(1); //will throw unsupportedOperationException
    }
}
