package week5_curriculum.class_activity_5A;

import java.util.ArrayList;
import java.util.Collections;

public class SortList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(50);
        list.add(40);
        list.add(30);
        list.add(20);
        list.add(10);

        Collections.sort(list); //To print from the lowest number to the highest number.
        for (Integer lt : list) {
            System.out.println(lt);
        }
    }
}
