package week5_curriculum.class_activity_3A;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {
    public static void main(String[] args) {
        HashSet<String> numbers = new HashSet<>();
        numbers.add("One");
        numbers.add("Two");
        numbers.add("Three");
        numbers.add("Four");
        numbers.add("Five");
        numbers.add("Five");

        numbers.remove("one");

        HashSet<String> numbers2 = new HashSet<>(); //Sani unblocked me here
        numbers2.add("Six");
        numbers2.add("Seven");
        numbers2.add("Eight");
        numbers.addAll(numbers2);

       for(String nums : numbers){
           System.out.println(nums);
       }
    }
}
