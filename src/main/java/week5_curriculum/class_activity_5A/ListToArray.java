package week5_curriculum.class_activity_5A;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListToArray {
    public static void main(String[] args) {
        List<String> fruit = new ArrayList<>();
        fruit.add("Mango");
        fruit.add("Orange");
        fruit.add("Sugarcane");


        String[] array = fruit.toArray(new String[0]);
        System.out.println("Array : " + Arrays.toString(array));
    }
}

