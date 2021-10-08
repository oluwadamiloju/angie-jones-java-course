package chapter12;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class CollectionsDemo {
    public static void main(String[] args) {
        setDemo();
        listDemo();
        queueDemo();
        mapDemo();
    }

    private static void setDemo() {
        Set<String> fruits = new HashSet();
        fruits.add("apple");
        fruits.add("lemon");
        fruits.add("banana");
        fruits.add("orange");
        fruits.add("lemon");

        //first method of iterating
        System.out.println("First method: using iterator method");
        var i = fruits.iterator();
        while(i.hasNext()) {
            System.out.println(i.next());
        }

        //second method
        System.out.println("Second method: enhanced for");
        for(String item: fruits) {
            System.out.println(item);
        }

        //third method
        System.out.println("Third method: foreach + lambda");
        fruits.forEach(x -> System.out.println(x));

        //fourth method
        System.out.println("Fourth method: foreach + syntactic sugar");
        fruits.forEach(System.out::println);
        System.out.println();
    }

    private static void listDemo() {
    }

    private static void queueDemo() {
    }

    private static void mapDemo() {
        Map <String, Integer> fruitCalories = new HashMap(); //<data type of key(mostly a string) and data type of value - use wrapper class if it's a primitive type>
        fruitCalories.put("apple", 95);
        fruitCalories.put("lemon", 20);
        fruitCalories.put("banana", 105);
        fruitCalories.put("orange", 45);
        fruitCalories.put("lemon", 17);

        //first method of iterating through a map
        for(var entry : fruitCalories.entrySet()) {
            System.out.println(entry.getValue());
        }
        System.out.println();
        //second method of iterating through a map
        fruitCalories.forEach(
                (key, value)-> System.out.println("Fruit: " + key + ", Calories: " + value)
        );
    }
}
