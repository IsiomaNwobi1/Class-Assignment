package week1_curriculum_activities.class_activity_10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayListExample {

    public static void main(String[] args) {

        List<String> list1 = new ArrayList<>();
        list1.add("one");
        list1.add("two");
        list1.add("three");
        list1.remove("four"); //to remove
        list1.add("five");


        //to sort using Collections
        Collections.sort(list1);

        //to sort using ForEach method
        for (String i : list1) {

            System.out.println(i);
        }
    }
}
