package week5_curriculum.class_activity_4A;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        HashMap<Integer, String> fruits = new HashMap<>();
        fruits.put(1, "Mango");
        fruits.put(2, "Apple");
        fruits.put(3, "Pineapple");
        fruits.put(4, "Orange");
        fruits.put(5, "Kiwi");

        //fruits.remove(2, "Apple"); //to remove
        //fruits.replace(2, "Date"); //to replace

        for(Map.Entry f : fruits.entrySet()) {
            System.out.println(f.getKey() + " " + f.getValue());
        }

        //System.out.println(fruits.containsKey(6)); //to check if an element is on the list

    }
}
